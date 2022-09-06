package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxesPageObject {

    public CheckBoxesPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[type='checkbox']")
    List<WebElement> checkBoxes;

    public void selectCheckbox() {
        checkBoxes.get(0).click();
        for(WebElement checkBox: checkBoxes){
            Assert.assertTrue(checkBox.isSelected());
        }
    }
}
