package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPageObject {
    public FileUploadPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "file-upload")
    WebElement browseButton;

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    WebElement uploadedFile;

    public String uploadFile(){
        browseButton.sendKeys(System.getProperty("user.dir") + "/src/test/resources/filetoupload");
        uploadButton.click();
        return uploadedFile.getText();
    }
}
