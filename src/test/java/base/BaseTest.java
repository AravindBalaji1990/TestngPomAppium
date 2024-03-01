package base;

import Framework.pageObjects.HomePageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
    public AndroidDriver driver;

    //PAGES
    public HomePageObjects homePageObjects;


    public Properties properties;
    FileInputStream fileInputStream;
    public DesiredCapabilities capabilities;


    public AndroidDriver getDriver(){return driver;}
}
