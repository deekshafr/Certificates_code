package Ecobase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.Loginrequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Baseservice {
    private static final String BASE_URL = "https://swift.techwithjatin.com/";
    private RequestSpecification requestSpecification;

    public Baseservice() {
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postrequest(Object payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }

protected Response postrequest(String baseUrl, Object payload, String endpoint) {
    return given()
            .baseUri(baseUrl)  // Use the provided baseUrl instead of baseURI
            .contentType(ContentType.JSON)
            .body(payload)
            .post(endpoint);
}

protected Response getrequest(String endpoint) {
    return requestSpecification.get(endpoint);
}

protected void setAuthtoken(String token) {
    requestSpecification.header("Authorization", "Bearer " + token); // Fixed typo "Berer" -> "Bearer"
}
}