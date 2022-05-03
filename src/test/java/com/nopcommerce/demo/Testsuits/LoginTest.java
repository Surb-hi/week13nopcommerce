package com.nopcommerce.demo.Testsuits;

import com.nopcommerce.demo.pages.Login;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    Login login = new Login();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        login.login();
        String actualMsg = "Welcome, Please Sign In!";
        String expectedMsg = login.welcomeMsg();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        login.login();
        login.username("prime1@gmail.com");
        login.password("prime123");
        login.clickOnLogin();
        String actualMsg = "Log out";
        String expectedMsg = login.logOut();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }

    @Test
    public void verifyTheErrorMessage() {
        login.login();
        login.username("prime12@gmail.com");
        login.password("prime1233");
        login.clickOnLogin();
        String expectedmsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMsg = login.errorNotification();
        System.out.println(actualMsg);
        Assert.assertEquals(actualMsg, expectedmsg, "");
    }
}



