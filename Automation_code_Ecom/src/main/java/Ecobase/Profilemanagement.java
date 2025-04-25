package Ecobase;

import io.restassured.response.Response;

public class Profilemanagement extends Baseservice{
    private static final String BASE_PATH="/api/users";
    public Response getprofile(String token){
        setAuthtoken(token);
        return getrequest(BASE_PATH+"/profile");
    }
}
