package appium.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class Create_account_Screen extends BasePage {

	public Create_account_Screen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"hussein.apps.talabaty:id/firstNameEditText\"]")).sendKeys("sadhas");
	@FindBy(xpath ="//android.widget.EditText[@resource-id=\"hussein.apps.talabaty:id/firstNameEditText\"]")
	WebElement First_Name;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id=\"hussein.apps.talabaty:id/lastNameEditText\"]")
	WebElement Last_Name;
	//android.widget.EditText[@resource-id="hussein.apps.talabaty:id/phoneEditText"]
	
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
	
	@FindBy(id="hussein.apps.talabaty:id/edPromoReferralCode")
	WebElement PromoCode;
	
	@FindBy(id="hussein.apps.talabaty:id/btnApply")
	WebElement Validate_BTN;
	
	@FindBy(id="hussein.apps.talabaty:id/registerButton")
	WebElement registerBTN;
	
	

	
	public void Create_Account(String Fname,String Lname,String num,String email,String password)
	{
		setTextElementText(First_Name  ,Fname);
		setTextElementText(Last_Name   ,Lname);
		setTextElementText(Phone_Num   ,num);
		setTextElementText(Email       ,email);
		setTextElementText(Password    ,password);
		//setTextElementText(Zone        ,zone);
		select = new Select(area);
		select.selectByIndex(5);
		clickButton(registerBTN);
		
	}
	public void Create_Account_Add_promoCode(String Fname,String Lname,String num,String email,String password,String promo)
	{
		setTextElementText(First_Name  ,Fname);
		setTextElementText(Last_Name   ,Lname);
		setTextElementText(Phone_Num   ,num);
		setTextElementText(Email       ,email);
		setTextElementText(Password    ,password);
		//setTextElementText(Zone        ,zone);
		select = new Select(area);
		select.selectByIndex(7);
     	setTextElementText(PromoCode, promo);
		clickButton(registerBTN);
		
	}
//	public void email&pass(String Fname)
//	{
//		setTextElementText(Email       ,email);
//		setTextElementText(Password    ,password);
//		setTextElementText(Zone        ,zone);
//		select = new Select(area);
//		select.selectByIndex(7);
////		setTextElementText(PromoCode, promo);
//		clickButton(registerBTN);
//		
//	}

	
}
