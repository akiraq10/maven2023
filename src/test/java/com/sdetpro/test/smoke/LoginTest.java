package com.sdetpro.test.smoke;

import com.sdetpro.model.pages.LoginPage;
import com.sdetpro.model.pages.UserDashboard;
import com.sdetpro.ultis.Url;
import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class LoginTest {

//
//    @BeforeTest
//    public void createTestData(){
//        System.out.println("Creating test Data....");
//
//    }
//    @AfterTest
//    public void deleteTestData(){
//        System.out.println("Deleting test Data....");
//
//    }
//    @BeforeMethod
//    public void runBeforeMethod(){
//        System.out.println("Before Method....");
//
//    }
//
//    @AfterMethod
//    public void runAfterMethod(){
//        System.out.println("After Method....");
//
//    }


    @Test
    public void registerUser(){
        System.out.println("Registering the user...");
//        fail("Registering user failed.....");

    }




    @Test(dependsOnMethods = "registerUser")
    public void loginWithCorrectCredential(){
        WebDriver driver= Webdriver.getChromeDriver();

        SoftAssert softAssert =new SoftAssert();
        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        LoginPage loginPAge=new LoginPage(driver);
        loginPAge
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();

        UserDashboard userDashboard=new UserDashboard(driver);
        String expectedPageHeader= "Secure Area";
        String actualPageHeader=userDashboard.getPageHeaderSelector().getText();
        softAssert.assertEquals(actualPageHeader,expectedPageHeader,"ERR| Page header is wrong!");




        assertTrue(userDashboard.getLogoutBtn().isDisplayed(),"ERR| Logout button is not display");
//        assertFalse(loginPAge.loginBtn().isDisplayed(),"ERR| Login button still display");

        //close btowser all assert all verification points
        driver.close();
        softAssert.assertAll();

    }

    @Test()
    public void loginWithIncorrectCredential1(){
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        LoginPage loginPAge=new LoginPage(driver);
        loginPAge
                .inputUsername("tomsmith")
                .inputPassword(".....")
                .clickOnLoginBtn();

        driver.close();

    }
}
