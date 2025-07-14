package com.api.test;

import com.api.base.Userprofile;
import com.api.model.request.profileRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test
   public void testPutResponse()
    {
        Userprofile userprofile = new Userprofile();
        userprofile.setAuthToken(userprofile.getAuthtoken());
        profileRequest profile = new profileRequest.Builder().firstName("Rahul1").lastName("Nav").email("rahul.nav@gamil.com").mobileNumber("1223456778").build();
        Response response =userprofile.putRequest(profile,"api/users/profile");
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
        }
}
