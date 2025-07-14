package pages;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo_classes.Jresp;
import pojo_classes.Root;
import pojo_classes.jsonResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class RestAssureFirst {
    public static void main(String[] args) throws JsonProcessingException {
//        RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts/1";
//
//      Response response = given().when().get();
//        //System.out.println(response.getBody().asString());
//
//       jsonResponse jr = response.getBody().as(jsonResponse.class);
//
////       System.out.println(jr.getBody());
////        System.out.println(jr.getId());
////
////        System.out.println(jr.getTitle());
////
////        System.out.println(jr.getUserId());
//
////
//        System.out.println(jr.toString());
//
////        jr.toString();
//
//
//        RestAssured.baseURI="https://dummyjson.com/posts/add";
//
//            jsonResponse jr= new jsonResponse();
//                jr.setBody("Sending body");
//                jr.setUserId(1);
//                jr.setTitle("Sending title");
//
//
////                System.out.println(jr.toString());
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsobody= objectMapper.writeValueAsString(jr);
//
////        objectMapper.write
//        Response response = given().header("Content-Type","application/json")
//                .body(jsobody).when().post();
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody().asString());
//
//        JsonPath jsonPath = response.getBody().jsonPath();
//
//        System.out.println(jsonPath.getString("body"));
//        Jresp jresp =response.getBody().as(Jresp.class);
//           System.out.println( jresp.getBody());
//
//        System.out.println( jresp.getId());
//        System.out.println( jresp.getTitle());
//        System.out.println( jresp.getUserId());

//
//        RestAssured.baseURI="https://89726f36-03a4-4a50-8ff1-d6ea690229a1.mock.pstmn.io";
//        Response response =given().when().get();
//        System.out.println(response.getBody().asString());
//        JsonPath jsonPath = response.getBody().jsonPath();
//
//
//
//        System.out.println(jsonPath.getString("query"));
//        System.out.println(jsonPath.getString("results[0].hotelId"));
//        List<String> listresults=jsonPath.getList("results.rooms");
////            System.out.println(listresults);


//        Root root =response.getBody().as(Root.class);
//        System.out.println(root.getResults());







    }

}
