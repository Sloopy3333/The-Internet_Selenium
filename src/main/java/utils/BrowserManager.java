package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

    public static WebDriver getBrowser(String browser){
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver");
                return new FirefoxDriver();
            default:
                return null;
        }
    }
}
