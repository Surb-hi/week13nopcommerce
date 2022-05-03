package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {
    By computer = By.linkText("Computers");
    By vcomputer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By Electronics = By.linkText("Electronics");
    By VElectronics = By.xpath("//h1[contains(text(),'Electronics')]");
    By Apparel = By.linkText("Apparel");
    By vApparel = By.xpath("//h1[contains(text(),'Apparel')]");
    By Digitaldownloads = By.linkText("Digital downloads");
    By vDigitaldownloads = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By Books = By.linkText("Books");
    By vBooks = By.xpath("//h1[contains(text(),'Books')]");
    By Jewelry = By.linkText("Jewelry");
    By vjewelry = By.xpath("//h1[contains(text(),'Jewelry')]");
    By GiftCards = By.linkText("Gift Cards");
    By vGiftCards = By.xpath("//h1[contains(text(),'Gift Cards')]");

    public void clickcomputer() {
        clickOnElement(computer);
    }

    public String verifycomputer() {
        return getTextFromElement(vcomputer);
    }

    public void clickElectronics() {
        clickOnElement(Electronics);
    }

    public String verifyElectronics() {
        return getTextFromElement(VElectronics);
    }

    public void clickApparel() {
        clickOnElement(Apparel);
    }

    public String verifyApparel() {
        return getTextFromElement(vApparel);
    }

    public void clickDigitaldownloads() {
        clickOnElement(Digitaldownloads);
    }

    public String verifyDigitaldownloads() {
        return getTextFromElement(vDigitaldownloads);
    }

    public void clickBooks() {
        clickOnElement(Books);
    }

    public String verifyBooks() {
        return getTextFromElement(vBooks);
    }

    public void clickJewelry() {
        clickOnElement(Jewelry);
    }

    public String verifyJewelry() {
        return getTextFromElement(vjewelry);
    }

    public void clickGiftCards() {
        clickOnElement(GiftCards);
    }

    public String verifyGiftCards() {
        return getTextFromElement(vGiftCards);
    }
}
