package ExamenFilaA.ejercicio1;

import ExamenFilaA.factoryRequest.FactoryRequest;
import clasesCRUDBasicAuth.Configuration;
import clasesCRUDBasicAuth.test.TestBase;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import java.util.Random;


import static org.hamcrest.Matchers.equalTo;

public class NewUserProyectTest extends TestBase {


    static Random rand = new Random();
    @Test
    public void UserProjectDeleteUserotherProject(){
                //create user
                JSONObject body = new JSONObject();
                body.put("Email", Configuration.user);
                body.put("Fullname", "Katzumi Urdininea");
                body.put("Password", Configuration.password);

                this.createUser(Configuration.user_host + ".json", body, post);

                //create project
                JSONObject bodyProject =new JSONObject();
                bodyProject.put("Content","holaaaa");

                this.createProject(bodyProject, post);

                //delete user
                this.deleteUser(body);


                //c project fail
                bodyProject.put("Content", "holiiiii");
                this.createProjectFail(bodyProject, post);


            }


            private void createUser(String host, JSONObject body, String post) {
                requestInfo.setUrl(host).setBody(body.toString());
                response = FactoryRequest.make(post).send(requestInfo);
                response.then().statusCode(200).body("FullName", equalTo(body.get("FullName"))).body("Email", equalTo(body.get("Email")));

            }
            private void createProject(JSONObject body, String post) {
                requestInfo.setUrl(Configuration.host+".json").setBody(body.toString());
                response = FactoryRequest.make(post).send(requestInfo);
                response.then().statusCode(200).body("Content", equalTo(body.get("Content")));

            }

            private void deleteUser(JSONObject body) {
                requestInfo.setUrl(Configuration.user_host+"https://todo.ly/api/user/0.json").setBody(body.toString());
                response = FactoryRequest.make(delete).send(requestInfo);
                response.then().statusCode(200).
                        body("FullName", equalTo(body.get("FullName"))).
                        body("Email", equalTo(body.get("Email")));
            }

            private void createProjectFail(JSONObject body, String post) {
                requestInfo.setUrl(Configuration.project_host+".json")
                        .setBody(body.toString());
                response = FactoryRequest.make(post).send(requestInfo);
                response.then().statusCode(200)
                        .body("ErrorMessage", equalTo("Account doesnt exist"));
            }


        }


