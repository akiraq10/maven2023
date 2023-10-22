package com.sdetpro.test.dataprovider;

import com.sdetpro.data.LoginInfo;
import com.sdetpro.driver.DriverBase;
import com.sdetpro.model.pages.LoginPage;
import com.sdetpro.model.pages.UserDashboard;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 extends DriverBase {

    WebDriver driver;
    @Test(dataProvider = "loginData")
    public void login_DataProvider_class2(String username, String pwd){
        System.out.println(username +"\t" +pwd );
//        WebDriver driver=getDriver();
        driver=getDriver();
//        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.inputUsername(username)
                .inputPassword(pwd)
                .clickOnLoginBtn();
        UserDashboard  userDashboard =new UserDashboard(driver);
        Assert.assertEquals(userDashboard.getLogoutBtn().isDisplayed(),true);


    }
    @Test
    public void login_ReadProperties_class2(){
        LoginInfo loginInfo= ConfigFactory.create(LoginInfo.class);
//        System.out.println(loginInfo.username());
//        System.out.println(loginInfo.password());
        String username=loginInfo.username();
        String pwd=loginInfo.password();

        System.out.println(username +"\t" +pwd );
//        WebDriver driver=getDriver();
        driver=getDriver();
//        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.inputUsername(username )
                .inputPassword(pwd)
                .clickOnLoginBtn();
        UserDashboard  userDashboard =new UserDashboard(driver);
        Assert.assertEquals(userDashboard.getLogoutBtn().isDisplayed(),true);

    }
    @Test
    public void loginWithIncorrectCreds_ReadProperties_class2(){
        LoginInfo loginInfo= ConfigFactory.create(LoginInfo.class);
//        System.out.println(loginInfo.username());
//        System.out.println(loginInfo.password());
        String username=loginInfo.username();
        String pwd=loginInfo.password();

        System.out.println(username +"\t" +pwd );
//        WebDriver driver=getDriver();
        driver=getDriver();
//        driver.get(Url.currentTestUrL("LOGIN_PAGE"));
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.inputUsername(loginInfo.usernameInvalid() )
                .inputPassword(pwd)
                .clickOnLoginBtn();
        UserDashboard  userDashboard =new UserDashboard(driver);
        Assert.assertEquals(userDashboard.getLogoutBtn().isDisplayed(),true);

    }
    @DataProvider
    public Object[][] loginData(){
        //Array with 2 rows and 2 cols
        /*
        tomsmith  SuperSecretPassword!
        tomsmith  123
        * */
        Object[][] loginData =new Object[2][2];
        loginData[0][0]="tomsmith";
        loginData[0][1]="SuperSecretPassword!";
        loginData[1][0]="tomsmith";
        loginData[1][1]="123";



        return loginData;
    }

}
