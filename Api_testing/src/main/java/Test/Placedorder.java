package Test;

import Base.Auth;
import Base.Userorder;
import Request.Loginreq;
import Request.Orderreq;
import Response.Loginresponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Placedorder {
    @Test
    public void place() {
        Loginreq loginreq = new Loginreq("12deeksha12@gmail.com", "Deeksha@06");
        Auth auth = new Auth();
        Response response = auth.login(loginreq);
        Loginresponse loginres = response.as(Loginresponse.class);
        String authToken = loginres.getToken();
        Orderreq orderreq = new Orderreq("India", "67a8df1ac0d3e6622a297ccb");
        Userorder userorder = new Userorder();
        Response orderResponse = userorder.placeorder(orderreq,authToken);
        System.out.println(orderResponse.getStatusCode());
        System.out.println("Order Response Status: " + orderResponse.getStatusCode());
        System.out.println("Order Response Body: " + orderResponse.getBody().asString());
//        assert orderResponse.jsonPath().getString("message").equals("Order placed successfully") : "Order placement failed!";

    }

    }
