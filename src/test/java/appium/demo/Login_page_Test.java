package appium.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_page_Test extends TestBase{

	public Login_page_Test() {
		// TODO Auto-generated constructor stub
	}
	Login_page logobj;
	
	 @DataProvider(name="testData")
	    public static Object[][] userData() {
	        return new Object[][]{
	            {"1005350682","password"},
	            {"1016606186","password"},
	            {"1016606188","password"},
	            {"1016609889","password"},
	            {"1561124844","password"},
	            {"502736702","1024*#Abdo_46"},
	            {"1005350682","1024#QqAa"},
	            {"56828988515","1024#QqAa"},
	            {"1005350682","password"},
	            {"502736704","password"},
	            {"1005350682","1024#QqAa"},
	            {"56828988515","password"},
	            {"502736708","1024#QqAa"},
	            {"56828988515","1024#QqAa"},
	            {"1005350682","password"},
	            {"56828988515","1024#QqAa"},
	            {"1005350682","1024#QqAa"},
	            {"56828988515","1024#QqAa"}
	        };
	    }
		
		//TEST CASE 1 
		@Test(priority = 1)
		public void login_validEmail_validPassword() throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login("ahmed9PM1@gmail.com", "S123456");	
		}
		
		//TEST CASE 2 
		@Test(priority = 2)
		public void login_validEmail_invalidPassword() throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login("ahmed9PM1@gmail.com", "S1234sssad684");	
		}
		
		 //TEST CASE 3 
		@Test(priority = 3)
		public void login_invalidEmail_validPassword() throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login("ahmed9PMasd1@gaamail.com", "S123456");	
		}
		
		@Test(priority = 4,dataProvider = "testData")
		public void login_WrongNumberFormat_validPassword(String phone,String pass) throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login(phone, pass);	
		}
		
		
		@Test(priority = 5)
		public void login_EmptyEmail_validPassword() throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login("", "S123456");	
		}
		
		@Test(priority = 6)
		public void login_Email_emptyPassword() throws InterruptedException
		{
		 logobj = new Login_page(driver);
		 logobj.Login("ahmed9PM1@gmail.com", "");	
		}
}
