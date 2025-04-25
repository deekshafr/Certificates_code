package TestCase;
import PageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
    @Test
    public void main() {
            LoginPage loginPage = new LoginPage(driver);
            ProductsPage productsPage = new ProductsPage(driver);
            CartPage cartPage = new CartPage(driver);
            Checkout check=new Checkout(driver);
            loginPage.login("standard_user", "secret_sauce");
            productsPage.addProductToCart("Sauce Labs Backpack");
            productsPage.addProductToCart("Sauce Labs Bike Light");
            productsPage.goToCart();
            cartPage.clickCheckout();
            check.checkoutcred("Deeksha","pandey","110045");
            check.finish();
//            cartPage.openMenu();
    }
}

