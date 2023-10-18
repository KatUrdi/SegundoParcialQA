package ExamenFilaA.ejercicio1;

import ExamenFilaA.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Hashtable;
import java.util.Properties;

public class NewUserProyectTest {

    RequestInfo requestInfo = new RequestInfo();
    Response response;

    String auth;
    JSONObject proyectBody = new JSONObject();
    JSONObject userbody = new JSONObject();

    @BeforeEach
    public void setup(){
        userbody.put("FullName", "Katzumi Urdininea");
        userbody.put("Email", "katurdininea02@gmail.com");
        userbody.put("Password","kat123");
        proyectBody.put("Content", "Holaaa segundo parcial" + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")));

    }

    @Test
    public void verifyUserProjectTest() {
        requestInfo.setHost(Properties.host + "api/user.json").setBody(userBody.toString());
        response = factoryRequest.make("post").send(requestInfo);
        response.then().log().all().statusCode(200)
                .body("Email", equalTo(userBody.get("Email")))
                .body("FullName", equalTo(userBody.get("FullName")));




    }
}
