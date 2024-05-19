package appium.demo;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import utilites.demo.Helper;

public class TestBase {
	 AndroidDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeSuite
	@Test
    public void openApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","14");
        //caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("deviceName","samsusng Sm-A155F");//sdk_gphone64_x86_64 Pixel33 Pixel
        caps.setCapability("app","D:/app.apk");
        caps.setCapability("adbExecTimeout", 80000);
        caps.setCapability("newCommandTimeout", 60000);    
        driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        
       // AppiumDriver driver =new AndroidDriver (new URL("http://192.168.1.170:4723/wd/hub"),caps);
        //AndroidDriver driver =new AndroidDriver (new URL("http://192.168.1.0:4723/wd/hub"),caps);
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"hussein.apps.talabaty:id/loginTextView\"]")).click();
        //driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"hussein.apps.talabaty:id/createAccountButton\"]")).click();
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
       // Thread.sleep(3000);
        //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"hussein.apps.talabaty:id/firstNameEditText\"]")).sendKeys("sadhas");
	}
	
	 @AfterMethod
   public void screenshotFailure(ITestResult result) throws IOException {
        if(result.getStatus()== ITestResult.FAILURE)
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenShot(driver,result.getName());
        }
}
	
}
