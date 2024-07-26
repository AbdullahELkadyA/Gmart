package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    AndroidDriver  driver;


      // public static void main( String[] args ) throws MalformedURLException {
    @BeforeTest
    public void Before()throws MalformedURLException{
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("13");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Pixel");
        options.setApp("D:/html/app-demo.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
    }




//DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
//        caps.setCapability("platformVersion","13");
//        caps.setCapability("automationName","UiAutomator2");
//// caps.setCapability("deviceName","samsusng Sm-A155F");
//        caps.setCapability("deviceName","Pixel");;//sdk_gphone64_x86_64 Pixel33 Pixel Y
//        caps.setCapability("app","D:/html/app-demo.apk");
//driver = new UiAutomator2Options(new URL("http://127.0.0.1:4723/wd/hub"),caps);



//AndroidDriver driver;
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
//        caps.setCapability("platformVersion","13");
//        caps.setCapability("automationName","UiAutomator2");
//        // caps.setCapability("deviceName","samsusng Sm-A155F");
//        caps.setCapability("deviceName","Pixel");;//sdk_gphone64_x86_64 Pixel33 Pixel Y
//        caps.setCapability("app","D:/html/app-demo.apk");
//        driver = new UiAutomator2Options(new URL("http://127.0.0.1:4723/wd/hub"),caps);

//driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"hussein.apps.talabaty:id/createAccountButton\"]")).click();
/////////////////////////////////////////////
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setPlatformName("Android");
//        options.setPlatformVersion("13");
//        options.setAutomationName("UiAutomator2");
//        options.setDeviceName("Pixel");
//        options.setApp("D:/html/app-demo.apk");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);