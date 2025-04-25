package Test;

import Base.Auth;
import Request.Loginreq;
import Response.Loginresponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Login {
@Test(description = "api loging")
    public void login(){
    Loginreq loginreq=new Loginreq("12deeksha12@gmail.com","Deeksha@06");
    Auth auth=new Auth();
    Response response= auth.login(loginreq);
    System.out.println(response.asString());
    System.out.println("Response Status Code: " + response.getStatusCode());
    System.out.println("Response Content-Type: " + response.getContentType());
    System.out.println("Response Body: " + response.asString());
    Loginresponse loginres=response.as(Loginresponse.class);
    System.out.println(loginres.getToken());
    System.out.println(loginres.getUserId());
    System.out.println(loginres.getMessage());

}}
