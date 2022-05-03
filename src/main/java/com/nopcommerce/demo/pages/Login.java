package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By loginlink=By.linkText("Log in");
    By welcomeText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By usernameLink=By.id("Email");
    By passwordLink=By.name("Password");
    By clickLogin=By.xpath("//button[contains(text(),'Log in')]");
    By logOutLink=By.linkText("Log out");
    By errorMsg=By.xpath("//div[@class='message-error validation-summary-errors']");

    public void login(){
        clickOnElement(loginlink);
    }
    public String welcomeMsg(){
        return getTextFromElement(welcomeText);
    }
    public void username(String textusername){
        sendTextToElement(usernameLink,textusername);

    }public void password(String textpassword){
        sendTextToElement(passwordLink,textpassword);
    }
    public void clickOnLogin(){
        clickOnElement(clickLogin);
    }
    public String logOut(){
        return getTextFromElement(logOutLink);
    }
    public String errorNotification(){
        return getTextFromElement(errorMsg);
    }
}
