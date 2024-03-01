package Framework.pageObjects;

import base.BasePage;
import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageObjects extends BasePage {

        public HomePageObjects(AndroidDriver driver) {
            super(driver);
        }

//        @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
//        public static WebElement btn_views;
    By btn_view =  AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']");
        public HomePageObjects checkHomePage(){
            checkElementIfExist(btn_view);
            return this;
        }
    }
