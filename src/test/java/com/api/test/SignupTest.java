package com.api.test;

import com.api.base.Authentication;
import com.api.model.request.LoginRequest;
import com.api.model.request.SignupRequest;
import com.api.model.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest {

    @Test
    public void signupTest(){
        Authentication authentication = new Authentication();
//        LoginRequest loginRequest = new LoginRequest("uday1234","uday12345");
//        Response response=authentication.login(loginRequest,"login");
//        System.out.println(response.asPrettyString());;
//        // LoginResponse loginResponse= new LoginResponse();
//        LoginResponse loginResponse = response.as(LoginResponse.class);
//        System.out.println(loginResponse.getToken());
//        System.out.println(loginResponse.getEmail());
//        System.out.println(loginResponse.id);

        SignupRequest signupRequest = new SignupRequest.Builder().userName("Rahul19389")
                .password("Rahul1243")
                .email("rahulnavgire8491@yahoo.com")
                .firstName("Rahul")
                .lastName("Nav")
                .mobileNumber("1234567890").build();
        Response response = authentication.signup(signupRequest,"signup");
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");


    }
}
