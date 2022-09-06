package utils;

import org.openqa.selenium.WebDriver;


public class DriverManager {
    private DriverManager(){
    }
    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    private static final DriverManager instance = new DriverManager();

    public static DriverManager getInstance(){
        return instance;
    }

    public void setDriver(WebDriver browser){
        driverPool.set(browser);
    }

    public WebDriver getDriver(){
        return driverPool.get();
    }

    public void quitDriver(){
        driverPool.get().quit();
        driverPool.remove();
    }


}
