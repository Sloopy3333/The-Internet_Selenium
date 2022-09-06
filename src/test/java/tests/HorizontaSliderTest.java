package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class HorizontaSliderTest extends BaseTest {
    @Test
    public void horizontalSlideTest(){
        homePage.clickHSlider();
        String val = horizontalSliderPageObject.slideHSlider(10);
        Assert.assertEquals(val, "3");
    }
}
