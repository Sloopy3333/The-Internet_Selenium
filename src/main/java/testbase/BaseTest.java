package testbase;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserManager;
import utils.DriverManager;
import utils.PropertiesManager;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public HomePageObject homePage;
    public AddRemoveElementPageObject addRemoveElementPageObject;
    public BasicAuthPageObject basicAuthPageObject;
    public BrokenImagesPageObject brokenImagesPageObject;
    public CheckBoxesPageObject checkBoxesPageObject;
    public ContextMenuPageObject contextMenuPageObject;
    public DragDropPageObject dragDropPageObject;
    public DropDowPageObject dropDowPageObject;
    public FileUploadPageObject fileUploadPageObject;
    public FloatingMenuPageObject floatingMenuPageObject;
    public FramesPageObject framesPageObject;
    public NestedFramesPageObject nestedFramesPageObject;
    public IFramePageObject iFramePageObject;
    public HorizontalSliderPageObject horizontalSliderPageObject;
    public JQueryMenuPageObject jQueryMenuPageObject;
    public JavaScriptAlertPageObject javaScriptAlertPageObject;
    public MultipleWindowPageObject multipleWindowPageObject;

    @BeforeMethod
    public void setUp() throws IOException {
        DriverManager.getInstance().setDriver(BrowserManager.getBrowser(PropertiesManager.getByKey("browser")));
        WebDriver driver = DriverManager.getInstance().getDriver();
        homePage = PageFactory.initElements(DriverManager.getInstance().getDriver(), HomePageObject.class);
        addRemoveElementPageObject = PageFactory.initElements(DriverManager.getInstance().getDriver(), AddRemoveElementPageObject.class);
        basicAuthPageObject = new BasicAuthPageObject(DriverManager.getInstance().getDriver());
        brokenImagesPageObject = new BrokenImagesPageObject(DriverManager.getInstance().getDriver());
        checkBoxesPageObject = new CheckBoxesPageObject(DriverManager.getInstance().getDriver());
        contextMenuPageObject = new ContextMenuPageObject(DriverManager.getInstance().getDriver());
        dragDropPageObject = new DragDropPageObject(DriverManager.getInstance().getDriver());
        dropDowPageObject = new DropDowPageObject(DriverManager.getInstance().getDriver());
        fileUploadPageObject = new FileUploadPageObject(DriverManager.getInstance().getDriver());
        floatingMenuPageObject = new FloatingMenuPageObject(DriverManager.getInstance().getDriver());
        framesPageObject = new FramesPageObject(DriverManager.getInstance().getDriver());
        nestedFramesPageObject = new NestedFramesPageObject(DriverManager.getInstance().getDriver());
        iFramePageObject = new IFramePageObject(DriverManager.getInstance().getDriver());
        horizontalSliderPageObject = new HorizontalSliderPageObject(DriverManager.getInstance().getDriver());
        jQueryMenuPageObject = new JQueryMenuPageObject(DriverManager.getInstance().getDriver());
        javaScriptAlertPageObject = new JavaScriptAlertPageObject(DriverManager.getInstance().getDriver());
        multipleWindowPageObject = new MultipleWindowPageObject(DriverManager.getInstance().getDriver());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(PropertiesManager.getByKey("aut"));
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.getInstance().quitDriver();
    }
}
