package Base;

import Request.Loginreq;
import Request.Orderreq;
import io.restassured.response.Response;

public class Userorder extends Baseservice{
    private static final String BASE_PATH="api/ecom/order/";
    public Response placeorder(Orderreq payload, String authToken){
        setAuthToken(authToken);
        return  postRequest(payload, BASE_PATH + "create-order");
    }

}
