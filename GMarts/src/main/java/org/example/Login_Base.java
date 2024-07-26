package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_Base extends BasePage{
    public Login_Base(AndroidDriver driver )
    {
        super(driver);
    }
    @FindBy(id="hussein.apps.talabaty:id/emailEditText")
    WebElement email_text;

    @FindBy(id="hussein.apps.talabaty:id/passwordEditText")
    WebElement pass_text;

    @FindBy(id="hussein.apps.talabaty:id/loginButton")
    WebElement LogBTN;

    @FindBy(id="hussein.apps.talabaty:id/text_input_end_icon")
    WebElement Show_Icon_pass;

    @FindBy(id="hussein.apps.talabaty:id/forgetPasswordTextView")
    WebElement Forgot_password_btn;

    @FindBy(id="hussein.apps.talabaty:id/getNewPasswordButton")
    WebElement get_new_password;
    public void Login(String Email_OR_Phone,String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(email_text));
        setTextElementText(email_text, Email_OR_Phone);
        setTextElementText(pass_text,  password);
        clickButton(Show_Icon_pass);
        clickButton(Show_Icon_pass);
        clickButton(LogBTN);
    }
    public void Forgot_password(String Email_OR_Phone)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(Forgot_password_btn));
        clickButton(Forgot_password_btn);
        setTextElementText(email_text, Email_OR_Phone);
        clickButton(get_new_password);

        clickButton(Show_Icon_pass);

        clickButton(Show_Icon_pass);
    }
}
