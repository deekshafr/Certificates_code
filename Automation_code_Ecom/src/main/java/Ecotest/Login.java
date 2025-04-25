package Ecotest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
    @Test(description = "Verify if login is working or not")
    public void login() {
        // Set Base URI
        RestAssured.baseURI = "http://64.227.160.186:8080";
        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"uday1234\", \"password\":\"uday12345\"}");
        Response response = request.post("/api/auth/login");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
