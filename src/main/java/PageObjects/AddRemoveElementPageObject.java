package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

import java.util.List;

public class AddRemoveElementPageObject {
    WebDriver driver;
    public AddRemoveElementPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(text(), 'Add Element')]")
    WebElement btnAddElements;

    @FindBy(xpath = "//button[contains(text(), 'Delete')]")
    List<WebElement> btnDelete;

    public void clickAddButton(int n){
        while(n>0){
            btnAddElements.click();
            n--;
        }
    }

    public int getNumberOfDeleteButtons(){
        return btnDelete.size();
    }

    public void clickDeleteButton(int n){
        while(n>0){
            btnDelete.get(n--).click();
        }
    }

    public void clickAllDeleteButtons(){
        for(WebElement element : btnDelete){
            element.click();
        }
    }
}
