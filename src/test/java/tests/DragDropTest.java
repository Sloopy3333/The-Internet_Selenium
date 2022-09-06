package tests;

import org.testng.annotations.Test;
import testbase.BaseTest;

public class DragDropTest extends BaseTest {

    @Test
    public void dragDropTest() throws InterruptedException {
        homePage.clickDragDrop();
        System.out.println(dragDropPageObject.dragDrop());
    }

}
