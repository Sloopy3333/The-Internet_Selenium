package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertPageObject {
    WebDriver driver;
    public JavaScriptAlertPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[contains(text(), 'Click for JS Alert')]")
    WebElement jsAlert;

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Confirm')]")
    WebElement jsConfirm;

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Prompt')]")
    WebElement jsPrompt;

    @FindBy(id = "result")
    WebElement result;

    public String manageJSAlert(){
        jsAlert.click();
        Alert alert =  driver.switchTo().alert();
        String msg = alert.getText();
        alert.accept();
        return msg;
    }

    public String manageJSConfirm(){
        jsConfirm.click();
        Alert alert =  driver.switchTo().alert();
        String msg = alert.getText();
        alert.accept();
        return msg;
    }

    public String manageJSPrompt(){
        jsPrompt.click();
        Alert alert =  driver.switchTo().alert();
        alert.sendKeys("hello world");
        alert.accept();
        return result.getText();
    }
}