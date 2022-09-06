package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ContextMenuPageObject {
    WebDriver driver;
    public ContextMenuPageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hot-spot")
    WebElement contextMenu;

    public String handleContextMenu() {
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenu).build().perform();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;

    }
}
