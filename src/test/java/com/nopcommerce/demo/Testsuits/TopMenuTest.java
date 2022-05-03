package com.nopcommerce.demo.Testsuits;

import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenu topMenu = new TopMenu();
@Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        topMenu.clickcomputer();
        String actualMsg = "Computers";
        String expectedMsg = topMenu.verifycomputer();
        Assert.assertEquals(actualMsg, expectedMsg, "");

    }
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        topMenu.clickElectronics();
        String actualMsg = "Electronics";
        String expectedMsg = topMenu.verifyElectronics();
        Assert.assertEquals(actualMsg, expectedMsg, "");

    }
@Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        topMenu.clickApparel();
        String actualMsg = "Apparel";
        String expectedMsg = topMenu.verifyApparel();
        Assert.assertEquals(actualMsg, expectedMsg, "");

    }
@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        topMenu.clickDigitaldownloads();
        String actualMsg = "Digital downloads";
        String expectedMsg = topMenu.verifyDigitaldownloads();
        Assert.assertEquals(actualMsg, expectedMsg, "");

    }
@Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        topMenu.clickBooks();
        String actualMsg = "Books";
        String expectedMsg = topMenu.verifyBooks();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
@Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        topMenu.clickJewelry();
        String actualMsg = "Jewelry";
        String expectedMsg = topMenu.verifyJewelry();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        topMenu.clickGiftCards();
        String actualMsg = "Gift Cards";
        String expectedMsg = topMenu.verifyGiftCards();
        Assert.assertEquals(actualMsg, expectedMsg, "");
    }
}
