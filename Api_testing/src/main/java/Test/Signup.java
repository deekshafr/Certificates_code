package Test;

import Base.Auth;
import Request.Signupreq;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Signup {
    @Test
    public void sign(){
        Signupreq signupreq= new Signupreq("Deeksha@06","Deeksha","Female","pandey","Student","true","deeksh@gmail.com","Deeksha@06","customer","7838280625");
        Auth auth=new Auth();
        Response response= auth.signup(signupreq);
        System.out.println("Response Body: " + response.asString());

    }
}
