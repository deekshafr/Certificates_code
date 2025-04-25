package Ecotest;import Ecobase.Authservice;import io.restassured.response.Response;
import org.apache.commons.lang3.ObjectUtils;import org.testng.Assert;import org.testng.annotations.Test;import request.Loginrequest;import response.Loginresponse;
public class login2 {
        @Test(description="Verify if login is working or not")
        public void login() {
            Loginrequest loginrequest=new Loginrequest("uday1234","uday12345");
            Authservice authservice = new Authservice();
            Response response = authservice.login(loginrequest);
            System.out.println(response);
            Loginresponse loginresponse=response.as(Loginresponse.class);
            System.out.println(response.asPrettyString());
            System.out.println(loginresponse.getEmail());
            System.out.println(loginresponse.getId());
            Assert.assertTrue(loginresponse.getEmail()!=null);
            Assert.assertEquals(loginresponse.getEmail(), "12deeksha12@gmail.com");
        }
    }
