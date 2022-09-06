package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IFramePageObject {
    WebDriver driver;
    public IFramePageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe")
    WebElement frame;

    @FindBy(xpath = "//p")
    WebElement text;

    public String getText(){
        driver.switchTo().frame(frame);
        return text.getText();
    }
}
