package com.sdetpro.test.parallel;

import com.sdetpro.driver.DriverBase;
import com.sdetpro.model.pages.LoginPage;
import com.sdetpro.model.pages.UserDashboard;
import com.sdetpro.ultis.Url;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDriverInstance extends DriverBase {
    @Test
    public  void testLogin(){
         WebDriver driver = getDriver();
//        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPAge=new LoginPage(driver);
        loginPAge
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();

        UserDashboard  userDashboard =new UserDashboard(driver);
        Assert.assertEquals(userDashboard.getLogoutBtn().isDisplayed(),true);

    }
    @Test
    public  void testLoginWithIncorrectCreds(){
        WebDriver driver = getDriver();
//        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPAge=new LoginPage(driver);
        loginPAge
                .inputUsername("tomsmith")
                .inputPassword(".....")
                .clickOnLoginBtn();
        UserDashboard  userDashboard =new UserDashboard(driver);
        Assert.assertEquals(userDashboard.getLogoutBtn().isDisplayed(),true);



    }



}
