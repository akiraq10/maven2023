package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class UrkPageTitleHandle {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("login"));
        driver.manage().window().maximize();

        By usernameSelector=By.id("username");
        By passwordSelector=By.id("password");
        By loginBtnSelector=By.cssSelector("[type='submit']");

        WebElement usernameElemn= driver.findElement(usernameSelector);
        WebElement passwordElemn= driver.findElement(passwordSelector);
        WebElement loginBtnElemn= driver.findElement(loginBtnSelector);

        usernameElemn.sendKeys("tomsmith");
        passwordElemn.sendKeys("SuperSecretPassword!");
        loginBtnElemn.click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtnSelector));

        String pageTitleAfterLogin =driver.getTitle();
        String pageUrlAfterLogin=driver.getCurrentUrl();

        System.out.println("Page Title: "+ pageTitleAfterLogin);
        System.out.println("Page Url: "+pageUrlAfterLogin);

        try{
            URL urlParser=new URL(pageUrlAfterLogin);
            System.out.println("Page's base URL: " + urlParser.getHost());
            System.out.println("Page URL path: "+urlParser.getPath());
        }catch (Exception e){
            e.printStackTrace();

        }




        driver.quit();

    }
}
