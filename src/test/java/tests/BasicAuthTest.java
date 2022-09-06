package tests;

import org.testng.annotations.Test;
import testbase.BaseTest;
import utils.DriverManager;

public class BasicAuthTest extends BaseTest {
    @Test
    public void basicAuthTest(){
        basicAuthPageObject.assertSuccessMessage(DriverManager.getInstance().getDriver());
    }
}
