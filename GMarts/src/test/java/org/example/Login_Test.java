package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test extends AppTest {
    First_screen objFirstScreen;
    Login_Base objLoginBase;
    //public WebElement ErrorMessage= driver.findElement(By.id("hussein.apps.talabaty:id/ld_message"));
    @BeforeTest
    public void Click_Login()
    {
        objFirstScreen = new First_screen(driver);
        objFirstScreen.LogIn_BTN();
    }

    @Test(priority = 1)
    public void login_validEmail_validPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("eliz.becker@gmail.com", "05211076");
    }
    @Test(priority = 2)
    public void login_validEmail_invalidPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("ahmed9PM1@gmail.com", "S1234sssad684");
    }

    //TEST CASE 3
    @Test(priority = 3)
    public void login_invalidEmail_validPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("ahmed9PMasd1@gaamail.com", "S123456");
    }

    @Test(priority = 4)
    public void login_WrongNumberFormat_validPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("3248#%%%@%AAv", "000");
    }


    @Test(priority = 5)
    public void login_EmptyEmail_validPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("", "S123456");
    }

    @Test(priority = 6)
    public void login_Email_emptyPassword()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Login("ahmed9PM1@gmail.com", "");
    }

    @Test(priority = 7)
    public void ForgotPassWord()
    {
        objLoginBase = new Login_Base(driver);
        objLoginBase.Forgot_password("abdullah@gmail.com");
//        if (ErrorMessage.isDisplayed())
//        {
//            System.out.println("IN valid mail");
//        }else
//        {
//            System.out.println("valid mail correct Send mail");
//
//        }

    }
}
