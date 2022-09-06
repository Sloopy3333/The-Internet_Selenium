package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPageObject {
    public FramesPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Nested Frames")
    WebElement nestedFrames;

    @FindBy(partialLinkText = "iFrame")
    WebElement iFrame;

    public void clickNestedFrames(){nestedFrames.click();}
    public void clickIFrames(){iFrame.click();}
}
