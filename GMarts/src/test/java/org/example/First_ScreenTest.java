package org.example;

import org.testng.annotations.Test;

public class First_ScreenTest extends AppTest{
    First_screen object ;

    @Test
    public void Create() {
        object=new First_screen(driver);
        object.Create_Btn();
    }
    @Test
    public void Login() {
        object=new First_screen(driver);
        object.LogIn_BTN();
    }
}
