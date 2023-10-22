package com.sdetpro.test;

import com.sdetpro.model.pages.LoginPage;
import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.WebDriver;

public class TestLoginWithPOM {
    public static void main(String[] args) {
        WebDriver driver=Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("login"));

        LoginPage loginPAge=new LoginPage(driver);

//        loginPAge.username().sendKeys("tomsmith");
//        loginPAge.password().sendKeys("SuperSecretPassword!");
//        loginPAge.loginBtn().click();

//        String loginBtnColor =loginPAge.loginBtn().getAttribute("background-color");
//        System.out.println("Login Btn Color" + loginBtnColor);
//
//        loginPAge.inputUsername("tomsmith");
//        loginPAge.inputPassword("SuperSecretPassword!");
//        loginPAge.clickOnLoginBtn();

        loginPAge
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();




    }
}
