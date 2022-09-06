package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

import java.util.List;

public class FloatingMenuTest extends BaseTest {

    @Test
    public void floatingMenuTest(){
        homePage.clickFloatingMenu();
        List<WebElement> menuItems = floatingMenuPageObject.scrollDown();
        Assert.assertEquals(menuItems.size(), 4);
    }
}
