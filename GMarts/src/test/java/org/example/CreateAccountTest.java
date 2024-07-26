package org.example;

import io.qameta.allure.Description;
import net.datafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccountTest extends AppTest {
    First_screen object_First_screen ;
    Login_Base objLoginBase;

    Create_Account object_CreateAccount;
    Faker fakeData = new Faker();
    String FIRST_NAME  = fakeData.name().firstName();;
    String Last_NAME  = fakeData.name().lastName();;
    String EMAIL_INPUT = fakeData.internet().emailAddress();
    String phone =generateEgyptianPhoneNumber(fakeData);
    String Password    = fakeData.number().digits(8).toString();
   // public WebElement ErrorMessage= driver.findElement(By.id("hussein.apps.talabaty:id/ld_message"));

    public static String generateEgyptianPhoneNumber(Faker faker) {
        // Generate a random Egyptian mobile network prefix
        String[] egyptianPrefixes = {"018", "019", "017", "013"};
        String prefix = egyptianPrefixes[faker.number().numberBetween(0, egyptianPrefixes.length)];

        // Generate the rest of the phone number
        String lineNumber = faker.number().digits(8); // 8 digits for the rest of the number

        // Combine to form the full phone number
        String phoneNumber = prefix + "-" + lineNumber.substring(0, 4) + "-" + lineNumber.substring(4);

        return phoneNumber;
    }

    @BeforeTest
    public void Create() {
        object_First_screen=new First_screen(driver);
        object_First_screen.Create_Btn();
    }
    @Description("Title: User Login\n"+
                 "Objective: To verify that a user can successfully log in with valid credentials\n"+
                 "This test case aims to ensure that the login functionality works correctly when a user provides valid login credentials. The system should authenticate the user and grant access to the application.")
    @Test(priority = 1)
    public void C_Account(){
        object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.CreateAccount(FIRST_NAME,Last_NAME,phone,EMAIL_INPUT,Password,"Tagmo3");
        System.out.println(FIRST_NAME);
        System.out.println(Last_NAME);
        System.out.println(EMAIL_INPUT);
        System.out.println(Password);
    }
    @Description("Title: Valid Promo Code Application assume is valid \n"+
                 "Objective: To verify that a valid promotional code is correctly applied to the user's order.\n" +
                 " This test case aims to ensure that the system accepts and applies a valid promotional code during the checkout process. The discount associated with the promo code should be correctly reflected in the order total.\n")
    @Test(priority = 2)
    public void try_Valid_promoCode()
    {
        object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.Create_Account_Add_promoCode(FIRST_NAME,Last_NAME,"0101660186",EMAIL_INPUT,Password,"Good2000");
    }

    @Description("Title: Verify User Cannot Sign Up with Mandatory Fields Left Empty \n"+
                 "Objective: To ensure that the system prevents user registration if any mandatory fields are left empty.\n" +
                 " This test case aims to validate that the registration process requires all mandatory fields to be filled. The system should display appropriate error messages and prevent the user from proceeding with the registration if any required fields are missing..\n")
    @Test(priority = 3)
    public void Signup_Without_mandatory_Fields()  {
        object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.CreateAccount("","","","","","");
    }

    @Description("Title: Valid Email\n"+
                 "Objective: To verify that a valid email is correctly applied.\n")
    @Test(priority = 4)
    public void Valid_Email()
    {
        object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.Create_Account_Add_promoCode(FIRST_NAME,Last_NAME,"0101660186","##",Password,"Good2000");
    }

    @Description("Title: Valid Password\n"+
            "Objective: To verify that a valid password credential at least 6 char.\n")
    @Test(priority = 5)
    public void Valid_PassWord()
    {
        object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.Create_Account_Add_promoCode(FIRST_NAME,Last_NAME,"0101660186",EMAIL_INPUT,"123","Good2000");
    }

    @Description("Title : Try InValid phone number")
    @Test(priority = 6)
	public void Create_Valid_Mobile_Number_Validation()
	{
		object_CreateAccount = new Create_Account(driver);
        object_CreateAccount.CreateAccount(FIRST_NAME,Last_NAME,"65464",EMAIL_INPUT,Password,"Tagmo3");
	}

    @Description("Title : Try duplicate phone number")
    @Test(priority = 7)
	public void Create_Duplicate_Phone_number()
	{
		object_CreateAccount = new Create_Account(driver);
		object_CreateAccount.CreateAccount(FIRST_NAME,Last_NAME,"01016606186",EMAIL_INPUT,Password,"tagmo3");
	}
}
