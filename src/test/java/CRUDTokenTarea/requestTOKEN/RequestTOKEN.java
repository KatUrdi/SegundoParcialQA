package CRUDTokenTarea.requestTOKEN;


import io.restassured.response.Response;
import CRUDTokenTarea.ConfigurationToken;

import static io.restassured.RestAssured.given;

public class RequestTOKEN {

    private static RequestTOKEN requestTOKEN;
    private String token;

    private RequestTOKEN(){
        Response response=given()
                .auth()
                .preemptive()
                .basic(ConfigurationToken.user, ConfigurationToken.password)
                .log()
                .all().
                when()
                .get(ConfigurationToken.authenticationToken);

        token = response.then().extract().path("TokenString");
    }

    public static RequestTOKEN getInstance(){
        if(requestTOKEN==null){
            requestTOKEN=new RequestTOKEN();
        }
        return requestTOKEN;
    }

    public String getToken() {
        return token;
    }
}
