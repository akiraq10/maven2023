package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginForm {
    public static void main(String[] args) {
        final String testUrl="https://the-internet.herokuapp.com/login";
        WebDriver driver=Webdriver.getChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); waiting all elements on a pahe
        driver.get(testUrl);
        driver.manage().window().maximize();

        WebElement usernameElem=driver.findElement(By.id("username"));
        WebElement passwordElem=driver.findElement(By.id("password"));
        WebElement loginBtnElem=driver.findElement(By.xpath("//button"));

        usernameElem.sendKeys("tomsmithw");
        passwordElem.sendKeys("SuperSecretPassword!");
        loginBtnElem.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));//Just wait a element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash-messages")));

        driver.findElement(By.id("wrong......")).click();

    }
}
