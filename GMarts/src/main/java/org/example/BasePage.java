package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public AndroidDriver driver ;
    public Select select ;
    public Actions action ;
    public BasePage(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement , String value)
    {
        textElement.sendKeys(value);
    }
}
