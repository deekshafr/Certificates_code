package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BaseCase {
    WebDriverWait wait;
public CartPage(WebDriver driver){
    super(driver);
}

    @FindBy(id = "checkout")
     WebElement checkoutButton;
    public void clickCheckout() {
       checkoutButton.click();
    }
}
//    @FindBy(id = "bm-burger-button")
//     WebElement menuButton;
//    // Method to open menu
//    public void openMenu() {
//        menuButton.click();
//    }

