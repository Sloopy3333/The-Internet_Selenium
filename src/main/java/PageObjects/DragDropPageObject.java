package PageObjects;

import dev.failsafe.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DragDropPageObject {
    WebDriver driver;
    public DragDropPageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    WebElement boxA;

    @FindBy(id = "column-b")
    WebElement boxB;

    public String dragDrop() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(boxA).moveToElement(boxB,5,5).perform();
        Thread.sleep(255);
        action.release(boxA);
        action.perform();
        return boxB.getText();
    }
}
