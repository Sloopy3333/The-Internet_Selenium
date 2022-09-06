package tests;

import PageObjects.AddRemoveElementPageObject;
import PageObjects.HomePageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;
import utils.DriverManager;

public class AddRemoveElementTest extends BaseTest {

    @Test
    public void addElements(){
        homePage.clickAddRemoveElement();
        addRemoveElementPageObject.clickAddButton(5);
        Assert.assertEquals(addRemoveElementPageObject.getNumberOfDeleteButtons(), 5);
    }

    public void removeElement(){
        homePage.clickAddRemoveElement();
        addRemoveElementPageObject.clickAddButton(5);
        addRemoveElementPageObject.clickDeleteButton(4);
        Assert.assertEquals(addRemoveElementPageObject.getNumberOfDeleteButtons(), 1);
    }

    @Test
    public void removeAllElement(){
        homePage.clickAddRemoveElement();
        addRemoveElementPageObject.clickAddButton(5);
        addRemoveElementPageObject.clickAllDeleteButtons();
        Assert.assertEquals(addRemoveElementPageObject.getNumberOfDeleteButtons(), 0);
    }
}
