package base;

import Framework.pageObjects.HomePageObjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTestIOS {
    public IOSDriver driver;

    //PAGES
    public HomePageObjects homePageObjects;


    public Properties properties;
    FileInputStream fileInputStream;
    public DesiredCapabilities capabilities;


    public IOSDriver getDriver(){return driver;}
}
