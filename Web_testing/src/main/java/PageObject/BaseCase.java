package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseCase {
    WebDriver driver;
    public BaseCase(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
