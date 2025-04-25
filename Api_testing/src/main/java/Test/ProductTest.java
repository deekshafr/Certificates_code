package Test;

import Base.Auth;
import Base.ProductService;
import Base.Userorder;
import Request.Loginreq;

import Request.Orderreq;
import Request.Signupreq;
import Response.Loginresponse;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ProductTest {
    @Test(description = "api loging")
    public void testCreateNewProduct(){
        Signupreq signupreq= new Signupreq("Deeksha@06","Deeksha","Female","pandey","Student","true","mohi@gmail.com","  Deeksha@06","customer","7838280625");
        Auth auth=new Auth();
        Response response1= auth.signup(signupreq);
        System.out.println("Response Body: " + response1.asString());
        Loginreq loginreq=new Loginreq("mohinijain@gmail.com","Deeksha@06");
        Response response= auth.login(loginreq);
        Loginresponse loginres=response.as(Loginresponse.class);
        String authToken = loginres.getToken();
        ProductService productService = new ProductService();
        String userId = "67a8df1ac0d3e6622a297ccb";
        String productName = "samba";
        String productCategory = "fashion";
        String productSubCategory = "shirts";
        String productPrice = "6000";
        String productDescription = "Adidas Originals";
        String productFor = "men";
        System.out.println(authToken);
        File productImage = new File("C:\\Users\\deeksha.p.in\\Pictures\\Screenshots\\2-month approval.png");
        Response productResponse = productService.createNewProduct(
                productName, userId, productCategory, productSubCategory,
                productPrice, productDescription, productFor, productImage,authToken);
        String responseBody = productResponse.asString();
        System.out.println("Response: " + responseBody);
        Assert.assertEquals(productResponse.getStatusCode(), 201, "Expected status code: 201");
        String productId = productResponse.jsonPath().getString("productId");
        Assert.assertNotNull(productId, "Product ID should not be null");
        System.out.println("Created Product ID: " + productId);
        System.out.println(authToken);
        Orderreq orderreq = new Orderreq("India",productId );
        Userorder userorder = new Userorder();
        Response orderResponse = userorder.placeorder(orderreq,authToken);
        System.out.println(orderResponse.getStatusCode());
        System.out.println("Order Response Status: " + orderResponse.getStatusCode());
        System.out.println("Order Response Body: " + orderResponse.asString());
        System.out.println(productId);
        given()
                .baseUri("https://rahulshettyacademy.com/api/ecom/product/")
                .header("Authorization",  authToken)
        .when()
                .delete("delete-product/{productId}",productId)
        .then()

                .log().body();


//        Response deleteResponse = productService.DeleteProduct(productId, authToken);
//        String deleteProductResponse = deleteResponse.getBody().asString();
//       System.out.println("Delete Response: " + deleteProductResponse);
//        System.out.println(authToken);
////
////        Assert.assertEquals(deleteResponse.getStatusCode(), 200, "Expected status code: 200");
////   Assert.assertEquals(message, "Product Deleted Successfully", "Delete message mismatch!");

    }

}
