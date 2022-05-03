package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {
    By registertionLink = By.linkText("Register");
    By vRegister = By.xpath("//a[contains(text(),'Register')]");
    By gender = By.id("gender-female");
    By firstname1 = By.id("FirstName");
    By lastName1 = By.name("LastName");
    By birthday = By.xpath("//select[@name='DateOfBirthDay']");
    By birthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By birthyear = By.xpath("//select[@name='DateOfBirthYear']");
    By email1 = By.name("Email");
    By password = By.name("Password");
    By conformpassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By vRegister1 = By.xpath("//div[text()='Your registration completed']");


    public void clickOnRegistertionLink() {
        clickOnElement(registertionLink);
    }

    public String VerifyRegister() {
        return getTextFromElement(vRegister);
    }

    public void clickOngender() {
        clickOnElement(gender);
    }

    public void firstname(String textusername) {
        sendTextToElement(firstname1, textusername);
    }

    public void lastname(String textlastname) {
        sendTextToElement(lastName1, textlastname);
    }

    public void birthDate(String textBirthDate) {
        selectByContainsTextFromDropDown(birthday, textBirthDate);
    }

    public void birthMonth(String textbirthmonth) {
        selectByContainsTextFromDropDown(birthMonth, textbirthmonth);
    }

    public void birthYear(String textbirthyear) {
        selectByContainsTextFromDropDown(birthyear, textbirthyear);
    }

    public void email(String textemail) {
        sendTextToElement(email1, textemail);
    }

    public void password(String textpassword) {
        sendTextToElement(password, textpassword);
    }

    public void confirmpassword(String textconfirmpassword) {
        sendTextToElement(conformpassword, textconfirmpassword);
    }

    public void register() {
        clickOnElement(registerButton);
    }

    public String setvRegister() {
        return getTextFromElement(vRegister1);
    }
}
