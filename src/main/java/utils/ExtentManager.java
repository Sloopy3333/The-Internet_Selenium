package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;

public class ExtentManager {
    static ExtentSparkReporter spark;
    static ExtentReports extent;

    public static ExtentReports setupExtent() throws IOException {
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/" + ReusableMethods.getDate() + ".html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        extent.setSystemInfo("AUT", PropertiesManager.getByKey("aut"));
        extent.setSystemInfo("User", System.getProperty("user.name"));
        extent.setSystemInfo("Browser", PropertiesManager.getByKey("browser"));
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        return extent;
    }

    public static void closeExtent(){
        ExtentManager.extent.flush();
    }
}
