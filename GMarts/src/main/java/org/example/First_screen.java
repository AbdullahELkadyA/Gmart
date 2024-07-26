package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class First_screen extends BasePage
{

    @FindBy(id ="hussein.apps.talabaty:id/createAccountButton")
    WebElement CreateBTN ;
    @FindBy(id ="hussein.apps.talabaty:id/loginTextView")
    WebElement LogInBTN ;

    public First_screen(AndroidDriver driver) {
        super(driver);
    }

    public void Create_Btn()
    {
        CreateBTN.click();
    }
    public void LogIn_BTN()
    {
        LogInBTN.click();
    }

}
