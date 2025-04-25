package Base;

import io.restassured.response.Response;
import java.io.File;

public class ProductService extends Baseservice {
    private static final String BASE_PATH = "api/ecom/product/";

    public Response createNewProduct(
            String productName, String productAddedBy, String productCategory,
            String productSubCategory, String productPrice, String productDescription,
            String productFor, File productImage,String token) {
        setAuthToken(token);
        return Postrequestwithparm(productName, productAddedBy, productCategory,
                productSubCategory, productPrice, productDescription,
                productFor, productImage, BASE_PATH + "add-product");
    }

public Response DeleteProduct(String productId, String token)
{
    System.out.println("Deleting Product ID: " + productId);
    setAuthToken(token);
    return deleteRequest(productId,BASE_PATH + "delete-product/{productId}");
}

}
