package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class NestedFramesTest extends BaseTest {
    @Test
    public void leftFrameTest(){
        homePage.clickFrames();
        framesPageObject.clickNestedFrames();
        Assert.assertEquals(nestedFramesPageObject.gotoLeftFrame(), "LEFT");
    }

    @Test
    public void middleFrameTest(){
        homePage.clickFrames();
        framesPageObject.clickNestedFrames();
        Assert.assertEquals(nestedFramesPageObject.gotoMiddleFrame(), "MIDDLE");
    }

    @Test
    public void rightFrameTest(){
        homePage.clickFrames();
        framesPageObject.clickNestedFrames();
        Assert.assertEquals(nestedFramesPageObject.gotoRightFrame(), "RIGHT");
    }

    @Test
    public void bottomFrameTest(){
        homePage.clickFrames();
        framesPageObject.clickNestedFrames();
        Assert.assertEquals(nestedFramesPageObject.gotoBottomFrame(), "BOTTOM");
    }
}
