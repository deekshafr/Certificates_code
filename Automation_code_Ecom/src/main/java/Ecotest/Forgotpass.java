package Ecotest;

import Ecobase.Authservice;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Forgotpass {
    @Test(description = "password change link sent")
    public void forgotpassword(){
        Authservice authservice=new Authservice();
        Response response=authservice.forgotpassword("ravi@gmail.com");
        System.out.println(response.asPrettyString());


    }
}
