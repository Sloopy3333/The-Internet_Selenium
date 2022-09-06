package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasicAuthPageObject {
    public BasicAuthPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[contains(text(), 'Congratulations')]")
    WebElement successMessage;

    public void assertSuccessMessage(WebDriver driver){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
        Assert.assertTrue(successMessage.getText().contains("Congratulations!"));
    }
}
