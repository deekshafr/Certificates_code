package Ecobase;

import io.restassured.response.Response;
import request.Loginrequest;
import request.Signuprequest;

import java.util.HashMap;

public class    Authservice extends Baseservice {
    private static final String BASE_PATH="/api/auth/";

 public Response login(Loginrequest payload) {
     return postrequest(payload, BASE_PATH + "login");
 }
 public Response signup(Signuprequest payload){
         return postrequest(payload,BASE_PATH+"signup");
 }
 public Response forgotpassword(String emailAddress){
     HashMap<String,String> payload= new HashMap<String,String>();
     payload.put("email",emailAddress);
     return postrequest(payload,BASE_PATH+"forgot-password");
 }

}
