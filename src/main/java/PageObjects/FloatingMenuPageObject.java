package PageObjects;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FloatingMenuPageObject {
    WebDriver driver;
    public FloatingMenuPageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "li")
    List<WebElement> floatingMenu;

    public List<WebElement> scrollDown(){
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
        return floatingMenu;
    }
}
