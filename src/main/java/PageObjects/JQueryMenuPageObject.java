package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class JQueryMenuPageObject {
    public WebDriver driver;
    public JQueryMenuPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[contains(text(), 'Enabled')]")
    WebElement enabledMenu;

    @FindBy(xpath = "//a[contains(text(), 'Downloads')]")
    WebElement downloadMenu;

    @FindBy(xpath = "//a[contains(text(), 'PDF')]")
    WebElement pdfMenu;

    public String clickPDF(){
        Actions actions = new Actions(driver);
        actions.moveToElement(enabledMenu).
                pause(Duration.ofSeconds(1)).
                moveToElement(downloadMenu).
                pause(Duration.ofSeconds(1)).
                moveToElement(pdfMenu).
                pause(Duration.ofSeconds(1)).
                build().perform();
        return pdfMenu.getText();
    }
}