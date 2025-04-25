package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage extends  BaseCase {
    public ProductsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(className = "inventory_item")
    List<WebElement> products;

    @FindBy(className = "shopping_cart_link")
     WebElement cartIcon;

    public void addProductToCart(String productName) {
        products.stream()
                .filter(product -> product.findElement(By.cssSelector(".inventory_item_name")).getText().equals(productName))
                .findFirst()
                .orElseThrow()
                .findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"))
                .click();
    }

    // Method to go to cart
    public void goToCart() {
        cartIcon.click();
    }
}


