package appium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class Login_page extends BasePage {

	public Login_page(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
	public void Login(String Email_OR_Phone,String password) throws InterruptedException
	{
		setTextElementText(email_text, Email_OR_Phone);
		setTextElementText(pass_text,  password);
		Thread.sleep(1000);
		clickButton(Show_Icon_pass);
		Thread.sleep(1000);
		clickButton(Show_Icon_pass);
		clickButton(LogBTN);
	}
	
	public void Forgot_password(String Email_OR_Phone,String password) throws InterruptedException
	{
		clickButton(Forgot_password_btn);
		setTextElementText(email_text, Email_OR_Phone);
		clickButton(get_new_password);
		//setTextElementText(pass_text,  password);
		Thread.sleep(1000);
		clickButton(Show_Icon_pass);
		Thread.sleep(1000);
		clickButton(Show_Icon_pass);
	}
}
