package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest(){
        homePage.clickDopdown();
        String selected = dropDowPageObject.selectDropDown(1);
        Assert.assertEquals(selected, "Option 1");
    }
}
