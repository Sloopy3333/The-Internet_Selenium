package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy_hh:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }

    public static String getScreenshot() throws IOException {
        File src = ((TakesScreenshot) DriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "/reports/screenshots/" + getDate() + ".png";
        FileHandler.copy(src, new File(dest));
        return dest;
    }
}
