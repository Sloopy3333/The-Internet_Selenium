package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    private static final ExtentTestManager testManager = new ExtentTestManager();
    private static final ThreadLocal<ExtentTest> testpool = new ThreadLocal<>();
    private ExtentTestManager() {
    }
    public static ExtentTestManager getInstance(){
        return testManager;
    }

    public void setTest(ExtentTest testObject){
        testpool.set(testObject);
    }

    public ExtentTest getTest(){
        return testpool.get();
    }
}
