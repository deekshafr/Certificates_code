package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends BaseCase {
    public Checkout(WebDriver driver){
        super(driver);
    }
    @FindBy(id ="first-name")
    WebElement Firstname;
    @FindBy(id="last-name")
    WebElement Lastname;
    @FindBy(id ="postal-code")
    WebElement Postalcode;
    @FindBy(id="continue")
    WebElement Continue;
    @FindBy(id="finish")
    WebElement finish;
    @FindBy(id="back-to-products")
    WebElement back;
   public void checkoutcred(String firstname , String lastname, String postalcode) {
       Firstname.sendKeys(firstname);
       Lastname.sendKeys (lastname);
       Postalcode.sendKeys(postalcode);
       Continue.click();

   }
   public  void finish(){
       finish.click();
   }
//   public void backt(){
//       back.click();
//   }
}
