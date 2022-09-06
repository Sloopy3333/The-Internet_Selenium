package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class BrokenImagesPageObject {
    public BrokenImagesPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "img")
    List<WebElement> images;

    public int getrokenImageCount(){
        int brokenImageCount = 0;
        for(WebElement image: images){
            if(image.getAttribute("naturalWidth").equals("0")){
                brokenImageCount++;
            }
        }
        return brokenImageCount;
    }
}
