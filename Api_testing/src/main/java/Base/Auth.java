package Base;

import Request.Loginreq;
import Request.Signupreq;
import io.restassured.response.Response;

public class Auth extends Baseservice {
    private static final String BASE_PATH = "api/ecom/auth/";

    public Response login(Loginreq payload) {
        return  postRequest(payload, BASE_PATH + "login");
    }
    public Response signup(Signupreq payload) {
        return postRequest(payload, BASE_PATH + "register");
    }
}
