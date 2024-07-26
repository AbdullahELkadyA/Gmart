package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Create_Account extends BasePage {
    public Create_Account(AndroidDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//android.widget.EditText[@resource-id=\"hussein.apps.talabaty:id/firstNameEditText\"]")
    WebElement First_Name;
    @FindBy(id="hussein.apps.talabaty:id/lastNameEditText")
    WebElement Last_Name;

    @FindBy(id="hussein.apps.talabaty:id/phoneEditText")
    WebElement Phone_Num;

    @FindBy(id="hussein.apps.talabaty:id/emailEditText")
    WebElement Email;

    @FindBy(id="hussein.apps.talabaty:id/passwordEditText")
    WebElement Password;

    @FindBy(id="hussein.apps.talabaty:id/areaEditText")
    WebElement area;

    @FindBy(id="hussein.apps.talabaty:id/compoundEditText")
    WebElement Zone;
    @FindBy(xpath="//android.widget.TextView[@resource-id=\"hussein.apps.talabaty:id/areaNameTextView\" and @text=\"5th Settlement\"]")
    WebElement choices;

    @FindBy(id="hussein.apps.talabaty:id/edPromoReferralCode")
    WebElement PromoCode;

    @FindBy(id="hussein.apps.talabaty:id/btnApply")
    WebElement Validate_BTN;

    @FindBy(id="hussein.apps.talabaty:id/registerButton")
    WebElement registerBTN;

    public void CreateAccount(String F_name,String L_name,String num,String email,String password,String zone)  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(First_Name));
        setTextElementText(First_Name  ,F_name);
        wait.until(ExpectedConditions.visibilityOf(Last_Name));
        setTextElementText(Last_Name   ,L_name);
        setTextElementText(Phone_Num   ,num);
        setTextElementText(Email       ,email);
        setTextElementText(Password    ,password);
        clickButton(area);
        wait.until(ExpectedConditions.visibilityOf(choices));
        clickButton(choices);
        setTextElementText(Zone        ,zone);
        clickButton(registerBTN);
    }
    public void Create_Account_Add_promoCode(String Fname,String Lname,String num,String email,String password,String promo)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(First_Name));
        setTextElementText(First_Name  ,Fname);
        setTextElementText(Last_Name   ,Lname);
        setTextElementText(Phone_Num   ,num);
        setTextElementText(Email       ,email);
        setTextElementText(Password    ,password);
        setTextElementText(PromoCode, promo);
        clickButton(registerBTN);

    }

}
