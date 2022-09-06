package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject {
    WebDriver driver;
    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(linkText = "A/B Testing")
    WebElement abTesting;

    @FindBy(linkText = "Add/Remove Elements")
    WebElement addRemoveElement;

    @FindBy(linkText = "Broken Images")
    WebElement brokenImages;

    @FindBy(linkText = "Checkboxes")
    WebElement checkBoxes;

    @FindBy(linkText = "Context Menu")
    WebElement contextMenu;

    @FindBy(linkText = "Drag and Drop")
    WebElement dragDrop;

    @FindBy(linkText = "Dropdown")
    WebElement dropDown;

    @FindBy(linkText = "File Upload")
    WebElement fileUpload;

    @FindBy(linkText = "Floating Menu")
    WebElement floatingMenu;

    @FindBy(linkText = "Frames")
    WebElement frames;

    @FindBy(linkText = "Horizontal Slider")
    WebElement hSlider;

    @FindBy(linkText = "JQuery UI Menus")
    WebElement jQueryMenu;

    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlerts;

    @FindBy(partialLinkText = "Multiple Windows")
    WebElement multipleWindow;
    public void clickAddRemoveElement(){
        addRemoveElement.click();
    }
    public void clickBrokenImages(){
        brokenImages.click();
    }
    public void clickCheckBoxes(){
        checkBoxes.click();
    }
    public void clickContextMenu(){
        contextMenu.click();
    }
    public void clickDragDrop(){dragDrop.click();}
    public void clickDopdown(){dropDown.click();}
    public void clickFileUpload(){fileUpload.click();}
    public void clickFloatingMenu(){floatingMenu.click();}
    public void clickFrames(){frames.click();}
    public void clickHSlider(){hSlider.click();}
    public void clickJQueryMenu(){jQueryMenu.click();}
    public void clickJavaScriptAlert(){javaScriptAlerts.click();}
    public void clickMultipleWindow(){multipleWindow.click();}
}
