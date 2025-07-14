package com.api.base;

import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseService {
    // This class is responsible to set the comm
    //Wrapper for the Rest assured
    // responsible to crating the request

    private static final String BASE_URL = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService(){

        requestSpecification = given().baseUri(BASE_URL);
    }

    public Response postRequest(Object payload, String endpoint){
        //Content type is the header that can be sent
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    public Response getRequest(String endpoint){
        return requestSpecification.get(endpoint);
    }

    public void setAuthToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }

    public String getAuthtoken(){
        Authentication authentication = new Authentication();
        LoginRequest loginRequest = new LoginRequest("uday1234","uday12345");
        Response response  =authentication.login(loginRequest,"login");
        LoginResponse loginResponse = response.as(LoginResponse.class);
        return loginResponse.getToken();
    }

    public Response putRequest(Object payload, String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);

    }


}
