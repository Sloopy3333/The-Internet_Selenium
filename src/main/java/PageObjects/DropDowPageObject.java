package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDowPageObject {
    public DropDowPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public String selectDropDown(int opt){
        Select select = new Select(dropDown);
        select.selectByIndex(opt);
        return select.getFirstSelectedOption().getText();
    }
}
