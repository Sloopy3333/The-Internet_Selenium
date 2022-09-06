package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowPageObject {
    WebDriver driver;
    public MultipleWindowPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(partialLinkText = "Click Here")
    WebElement clickHere;

    @FindBy(tagName = "h3")
    WebElement text;

    public String handleMultipleWindow(){
        clickHere.click();
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        return text.getText();
    }
}
