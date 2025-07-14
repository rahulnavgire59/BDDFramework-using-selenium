package com.api.base;

import io.restassured.response.Response;

import java.security.PublicKey;

public class Userprofile extends BaseService{

    public Response getProfile(String endpoint){
        return getRequest(endpoint);
    }

    public Response updateProfile(String body,String endpoint){
        return putRequest(body,endpoint);
    }


}
