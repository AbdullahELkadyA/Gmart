package appium.demo;

import org.testng.annotations.Test;

public class Create_account_test extends TestBase {

	public Create_account_test() {
		// TODO Auto-generated constructor stub
	}
	Create_account_Screen crobj;

	//Verify that a user can successfully sign up with all valid inputs.
	@Test(priority = 1)
	public void Create_successfully_sign_up_with_all_valid_inputs() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","10116606153","Abdulla@gmail.com","dfg");
		}
	
	@Test(priority = 2)
	public void Create_testVerify_that_the_user_cannot_sign_up_with_any_mandatory_fields_left_empty() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("", "", "", "", "");
	}

	
	@Test(priority = 3)
	public void Create_test_Invalid_Email_Format() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","10116606153","Abdulla@asgmsaail.casdom","dfg");
	}
	
	
	@Test(priority = 4)
	public void Create_Duplicate_Email_Address() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","10116606153","Abdulla@gmail.com","dfg");
	}
	
	@Test(priority = 5)
	public void Create_Duplicate_Phone_number() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","10116606153","Abdunhhlla@gmail.com","dfg");
	}
	
	@Test(priority = 6)// Based on business requirements
	public void Create_password_credentential() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","1146606153","Abduhohilla@gmail.com","123456");
	}
	
	@Test(priority = 7)// Based on valid promo code
	public void Create_Valid_Promo_Referral_Code() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account_Add_promoCode("Abdullah","Amin","10116606153","Abdulla@gmail.com","dfg","Valid Promo code");
	}
	
		
	@Test(priority = 8)
	public void Create_Valid_Mobile_Number_Validation() 
	{
		crobj = new Create_account_Screen(driver);
		crobj.Create_Account("Abdullah","Amin","65464","Abdulla@gmail.com","dfg");
	} 
		
	
	
	
	
	
	
}
