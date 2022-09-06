package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest(){
        homePage.clickFileUpload();
        Assert.assertEquals(fileUploadPageObject.uploadFile(), "filetoupload");
    }
}
