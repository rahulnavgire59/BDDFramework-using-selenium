package com.api.test;

import static io.restassured.RestAssured.*;

import com.api.base.Authentication;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.api.Listners.TestListners.class)
public class LoginTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    //        @Test
//        public void TestLogin(){
//            baseURI="http://64.227.160.186:8080";
//            RequestSpecification requestSpecification = RestAssured.given();
//            requestSpecification.header("Content-Type", "application/json").
//                  body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}");
//
//            Response response =requestSpecification.post("api/auth/login");
//            System.out.println(response.getBody().asPrettyString());
//            System.out.println(response.statusCode());
//            Assert.assertEquals(response.statusCode(),200);
//
//            //  Rest Assured implements Builder design pattern
//            // 401 gives when creds are invalid
//
//
//
//        }
    @Test
    public void TestLogin() {
        Authentication authentication = new Authentication();
        LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
        Response response = authentication.login(loginRequest, "login");
        System.out.println(response.asPrettyString());
        ;
        // LoginResponse loginResponse= new LoginResponse();
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.id);

    }


}
