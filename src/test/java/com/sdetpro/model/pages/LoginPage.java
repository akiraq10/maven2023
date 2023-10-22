package com.sdetpro.model.pages;

import com.sdetpro.model.components.FooterComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By usernameSelector = By.id("username");
    private By passwordSelector = By.id("password");
    private  By loginBtnSelector= By.cssSelector("[type='submit']");
//    private FooterComponent footerComponent;

    public LoginPage (WebDriver driver){
        this.driver=driver;


    }
//    public WebElement username(){
//        return driver.findElement(usernameSelector);
//    }
    public WebElement password(){
        return driver.findElement(passwordSelector);
    }
    public WebElement loginBtn(){
        return driver.findElement(loginBtnSelector);
    }

//    public void inputUsername(String username){
//        username().sendKeys(username);
//    }

    public FooterComponent footerComponent(){
        return new FooterComponent(driver);

    }
    public LoginPage inputUsername(String username){
        WebElement usernameElem =driver.findElement(usernameSelector);
        usernameElem.sendKeys(username);
        return this;
    }
    public LoginPage inputPassword(String password){
        password().sendKeys(password);
        return this;

    }
    public LoginPage clickOnLoginBtn(){
        loginBtn().click();
        return this;
    }
//    public void inputPassword(String password){
//        password().sendKeys(password);
//    }
//    public void clickOnLoginBtn(){
//        loginBtn().click();
//    }


}
