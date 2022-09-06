package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPageObject {
    WebDriver driver;
    public NestedFramesPageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//frame[@src = '/frame_top']")
    WebElement topFrame;


    @FindBy(xpath = "//frame[@src = '/frame_left']")
    WebElement leftFrame;


    @FindBy(xpath = "//frame[@src = '/frame_middle']")
    WebElement middleFrame;


    @FindBy(xpath = "//frame[@src = '/frame_right']")
    WebElement rightFrame;

    @FindBy(xpath = "//frame[@src = '/frame_bottom']")
    WebElement bottomFrame;

    @FindBy(xpath = "//body")
    WebElement content;

    public String gotoLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        return content.getText();
    }

    public String gotoMiddleFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(middleFrame);
        return content.getText();
    }

    public String gotoRightFrame() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(rightFrame);
        return content.getText();
    }

    public String gotoBottomFrame() {
        driver.switchTo().frame(bottomFrame);
        return content.getText();
    }
}
