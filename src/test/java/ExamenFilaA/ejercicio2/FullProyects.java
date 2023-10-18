package ExamenFilaA.ejercicio2;

import ExamenFilaA.factoryRequest.FactoryRequest;
import ExamenFilaA.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import ExamenFilaA.utils.Properties;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import static org.hamcrest.Matchers.equalTo;

    public class FullProyects {

        RequestInfo requestInfo = new RequestInfo();
        Response response;
        String auth;
        String[] projectsContent = {
                "Proyect 1 " + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")),
                "Project 2 " + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")),
                "Project 3 " + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")),
                "Project 4 " + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"))

        };

        @BeforeEach
        public void setup() {
            auth = Base64.getEncoder().encodeToString((Properties.user +":"+ Properties.pwd).getBytes());
        }

        @Test
        public void verifyMultipleProjectsTest() {
            for(int i = 0; i<4; i++) {
                requestInfo.setHost(Properties.host + "api/projects.json").setBody("{\"Content\":\""+projectsContent[i]+"\"}").setHeader("Authorization", "Basic " + auth);
                response = FactoryRequest.make("post").send(requestInfo);
                response.then().log().all().statusCode(200)
                        .body("Content", equalTo(projectsContent[i]));
            }

            requestInfo.setHost(Properties.host + "api/projects.json").setHeader("Authorization", "Basic " + auth);
            response = FactoryRequest.make("get").send(requestInfo);
            response.then().log().all().statusCode(200);

            JSONArray jsonArray = new JSONArray(response.body().print());
            for(int i = 0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("Id");
                requestInfo.setHost(Properties.host + "api/projects/"+id+".json").setHeader("Authorization", "Basic " + auth);
                response = FactoryRequest.make("delete").send(requestInfo);
                response.then().log().all().statusCode(200)
                        .body("Id", equalTo(id))
                        .body("Deleted", equalTo(true));
            }

        }


    }

