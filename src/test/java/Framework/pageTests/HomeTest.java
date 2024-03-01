package Framework.pageTests;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import static utils.extentReport.ExtentTestManager.startTest;

public class HomeTest extends BaseTest {


    @BeforeMethod
    @Parameters({"platformName","appPackage","appActivity"})
    public void Start(Method method, String platformName, String appPackage, String appActivity) throws MalformedURLException, InterruptedException {
        startTest(method.getName(),"Testing");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(platformName);
        options.setDeviceName("emulator-5554");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setAppPackage(appPackage);
        options.setAppActivity(appActivity);
        options.setAppWaitForLaunch(true);
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        Thread.sleep(5000);
    }

    @Test(priority = 0, description = "Check home page")
    public void checkHomePage(){

        homePageObjects.checkHomePage();

    }
}
