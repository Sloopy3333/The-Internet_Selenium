package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPageObject {
    WebDriver driver;
    public HorizontalSliderPageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement hSlider;

    public String slideHSlider(int val){
        Actions action = new Actions(driver);
        action.moveToElement(hSlider).clickAndHold().moveByOffset(10, 0).release().build().perform();
        return hSlider.getAttribute("value");
    }
}
