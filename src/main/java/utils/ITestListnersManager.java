package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ITestListnersManager implements ITestListener {
    public static ExtentReports extent;
    public static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        try {
            extent = ExtentManager.setupExtent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ITestContext context) {
ExtentManager.closeExtent();
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        ExtentTestManager.getInstance().setTest(test);
        System.out.println(ExtentTestManager.getInstance().getTest());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       ExtentTestManager.getInstance().getTest().log(Status.PASS, "test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getInstance().getTest().log(Status.FAIL, "test failed");
        try {
            ExtentTestManager.getInstance().getTest().addScreenCaptureFromPath(ReusableMethods.getScreenshot());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getInstance().getTest().log(Status.FAIL, "test failed");
        try {
            ExtentTestManager.getInstance().getTest().addScreenCaptureFromPath(ReusableMethods.getScreenshot());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ExtentTestManager.getInstance().getTest().log(Status.FAIL, "test failed");
        try {
            ExtentTestManager.getInstance().getTest().addScreenCaptureFromPath(ReusableMethods.getScreenshot());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ExtentTestManager.getInstance().getTest().log(Status.FAIL, "test failed");
        try {
            ExtentTestManager.getInstance().getTest().addScreenCaptureFromPath(ReusableMethods.getScreenshot());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
