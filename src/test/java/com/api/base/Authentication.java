package com.api.base;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignupRequest;
import io.restassured.response.Response;

    public class Authentication extends BaseService {

        public static final String BASE_PATH = "/api/auth/";



    public Response login(LoginRequest payload, String endpoint){
    return postRequest(payload,BASE_PATH+endpoint);

}

public Response signup(SignupRequest signupRequest,String endpoint){
    return postRequest(signupRequest,BASE_PATH+endpoint);
}
}