package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class BrokenImageTest extends BaseTest {

    @Test
    public void brokenImagesTest(){
        homePage.clickBrokenImages();
        Assert.assertEquals(brokenImagesPageObject.getrokenImageCount(), 2);
    }
}
