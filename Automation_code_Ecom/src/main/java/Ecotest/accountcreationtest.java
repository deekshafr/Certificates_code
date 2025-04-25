package Ecotest;

import Ecobase.Authservice;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import request.Signuprequest;

public class accountcreationtest {
    @Test(description = "verifying api testing")
    public void creataccount(){
        Signuprequest signuprequest= new Signuprequest.builder()
                .username("riyaj")
                .email("riya@gmail.com")
                .firstname("riya")
                .lastname("jain")
                .mobile("7878280625")
                .build();
        Authservice authservice=new Authservice();
        Response response=authservice.signup(signuprequest);
        System.out.println(response);
        Assert.assertEquals(response.jsonPath().getString("message"), "Username is already taken!");
        System.out.println("Response Body: " + response.asPrettyString());
        System.out.println("Response Status Code: " + response.statusCode());

//        Assert.assertEquals(response.asPrettyString(),"Username is already taken!");
//       Assert.assertEquals(response.statusCode(),400);
    }

}
