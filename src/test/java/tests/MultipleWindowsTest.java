package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class MultipleWindowsTest extends BaseTest {
    @Test
    public void multipleWindowTest(){
        homePage.clickMultipleWindow();
        String text = multipleWindowPageObject.handleMultipleWindow();
        Assert.assertEquals(text, "New Window");
    }
}
