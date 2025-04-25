package Test;
import Base.Auth;
import Base.Userorder;
import Request.Loginreq;
import Request.Orderreq;
import Response.Loginresponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderplace {
    @Test
    public void place() {
        Loginreq loginreq = new Loginreq("12deeksha12@gmail.com", "Deeksha@06");
        Auth auth = new Auth();
        Response loginResponse = auth.login(loginreq);
        System.out.println("Login Response Status: " + loginResponse.getStatusCode());
        System.out.println("Login Response Body: " + loginResponse.asString());
        Loginresponse loginres = loginResponse.as(Loginresponse.class);
        String token = loginres.getToken();
        Assert.assertNotNull(token, "Token should not be null");
//        Baseservice baseService = new Baseservice();
//        baseService.setAuthToken(token);
        Orderreq orderreq = new Orderreq("British Indian Ocean Territory", "67a8dde5c0d3e6622a297cc8");
        Userorder userorder = new Userorder();
        Response orderResponse = userorder.placeorder(orderreq,token);
        System.out.println("Order Response Status: " + orderResponse.getStatusCode());
        System.out.println("Order Response Body: " + orderResponse.asString());
//        Assert.assertEquals(orderResponse.getStatusCode(), 200, "Order placement failed!");

    }
}
