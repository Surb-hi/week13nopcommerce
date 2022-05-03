package com.nopcommerce.demo.Testsuits;

import com.nopcommerce.demo.pages.Register;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    Register register=new Register();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        register.clickOnRegistertionLink();
        String actualMsg = "Register";
        String expectedMsg = register.VerifyRegister();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        register.clickOnRegistertionLink();
        register.clickOngender();
        register.firstname("prime");
        register.lastname("patel");
        register.birthDate("1");
        register.birthMonth("may");
        register.birthYear("1997");
        register.email("prime1@gmail.com");
        register.password("prime123");
        register.confirmpassword("prime123");
        register.register();
        String actualMsg = "Your registration completed";
        String expectedMsg = register.setvRegister();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }

}
