package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class JavaScriptAlertTest extends BaseTest {
    @Test
    public void jsAlertTest(){
        homePage.clickJavaScriptAlert();
        String msg = javaScriptAlertPageObject.manageJSAlert();
        Assert.assertEquals(msg, "I am a JS Alert");
    }

    @Test
    public void jsConfirmTest(){
        homePage.clickJavaScriptAlert();
        String msg = javaScriptAlertPageObject.manageJSConfirm();
        Assert.assertEquals(msg, "I am a JS Confirm");
    }

    @Test
    public void jsPromptTest(){
        homePage.clickJavaScriptAlert();
        String msg = javaScriptAlertPageObject.manageJSPrompt();
        Assert.assertEquals(msg, "You entered: hello world");
    }
}
