package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.BaseTest;

public class ContextMenuTest extends BaseTest {
    @Test
    public void contextMenuTest() {
        homePage.clickContextMenu();
        Assert.assertEquals(contextMenuPageObject.handleContextMenu(), "You selected a context menu");
    }
}
