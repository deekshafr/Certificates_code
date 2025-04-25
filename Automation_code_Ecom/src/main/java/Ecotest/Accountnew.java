package Ecotest;

import Ecobase.Authservice;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import request.Signuprequest;

public class Accountnew {
    @Test(description = "Verifying API signup functionality")
    public void createAccount() {
        Signuprequest signuprequest = new Signuprequest.builder()
                .username("ravij")
                .email("ravi@gmail.com")
                .firstname("ravi")
                .lastname("jain")
                .mobile("7838280625")
                .build();
        Authservice authservice = new Authservice();
        Response response = authservice.signup(signuprequest);
        System.out.println("Response Body: " + response.asPrettyString());
        System.out.println("Response Status Code: " + response.statusCode());
        Assert.assertEquals(response.jsonPath().getString("message"), "Username is already taken!");
        Assert.assertEquals(response.statusCode(), 400);
    }
}
