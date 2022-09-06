package tests;

import org.testng.annotations.Test;
import testbase.BaseTest;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest extends BaseTest {

    @Test
    public void selectCheckBoxes() throws InterruptedException {
        homePage.clickDragDrop();
        contextMenuPageObject.handleContextMenu();
        TimeUnit.SECONDS.sleep(10);
    }
}
