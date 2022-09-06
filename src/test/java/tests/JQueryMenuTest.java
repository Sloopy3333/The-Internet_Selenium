package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class JQueryMenuTest extends BaseTest {
    @Test
    public void jQueryMenuTest(){
        homePage.clickJQueryMenu();
        String txt = jQueryMenuPageObject.clickPDF();
        Assert.assertEquals(txt, "PDF");
    }
}
