package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class IFrameTest extends BaseTest {

    @Test
    public void iFrameGetText(){
        homePage.clickFrames();
        framesPageObject.clickIFrames();
        Assert.assertEquals(iFramePageObject.getText(),"Your content goes here.");
    }
}
