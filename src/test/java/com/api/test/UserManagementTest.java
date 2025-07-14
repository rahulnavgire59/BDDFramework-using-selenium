package com.api.test;

import com.api.base.Authentication;
import com.api.base.BaseService;
import com.api.base.Userprofile;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserManagementTest {

    @Test(description = "Testing user profile service")
    public void userProfileTest(){
        Userprofile userprofile = new Userprofile();
        userprofile.setAuthToken(userprofile.getAuthtoken());
         Response response=userprofile.getRequest("/api/users/profile");
         System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        System.out.println(userProfileResponse.getId());
    }





}
