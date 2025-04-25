package Base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Baseservice {


    public static final String BASE_URL = "https://rahulshettyacademy.com/";
    private String authToken = "";

    protected void setAuthToken(String token) {
        this.authToken = token;
    }

    protected RequestSpecification createRequest() {
        RequestSpecification request = given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)

                .accept(ContentType.JSON);

        if (!authToken.isEmpty()) {
            request.header("Authorization",  authToken);
        }
        return request;
    }

    protected Response getRequest(String endpoint) {
        return createRequest().get(endpoint);
    }

    protected Response postRequest(Object payload, String endpoint) {
        return createRequest().body(payload).post(endpoint);
    }

    protected Response putRequest(Object payload, String endpoint) {
        return createRequest().body(payload).put(endpoint);
    }

    protected Response deleteRequest(String productId,String endpoint) {
        return createRequest()
//                .pathParam("productId",productId)
                .delete(endpoint,productId);
    }
//protected Response deleteRequest(String endpoint , String productId,String token) {
//    RequestSpecification deleteReq = RestAssured.given()
//            .log().all()
//            .pathParam("productId", productId);
////            .delete(endpoint);
//
//    return deleteReq.when().delete(endpoint);
//}

    protected Response Postrequestwithparm(
            String productName, String productAddedBy, String productCategory,
            String productSubCategory, String productPrice, String productDescription,
            String productFor, File productImage, String endpoint) {

        return createRequest()
                .contentType("multipart/form-data")
                .multiPart("productImage", productImage)
                .formParam("productName", productName)
                .formParam("productAddedBy", productAddedBy)
                .formParam("productCategory", productCategory)
                .formParam("productSubCategory", productSubCategory)
                .formParam("productPrice", productPrice)
                .formParam("productDescription", productDescription)
                .formParam("productFor", productFor)
                .post(endpoint);
    }
}
//    private static final String BASE_URL = "https://rahulshettyacademy.com/";
//    private RequestSpecification requestSpecification;
//
//    public Baseservice() {
//        requestSpecification = given().baseUri(BASE_URL);
//    }
//
//    protected Response postrequest(Object payload, String endpoint) {
//        return requestSpecification
//                .contentType(ContentType.JSON)
//                .body(payload)
//                .post(endpoint);
//    }
//    protected void setAuthtoken(String token) {
//        requestSpecification.header("Authorization",  token); // Fixed typo "Berer" -> "Bearer"
//    }
//    protected Response postrequest(String baseUrl, Object payload, String endpoint) {
//        return given()
//                .baseUri(baseUrl)  // Use the provided baseUrl instead of baseURI
//                .contentType(ContentType.JSON)
//                .body(payload)
//                .post(endpoint);
//    }
//