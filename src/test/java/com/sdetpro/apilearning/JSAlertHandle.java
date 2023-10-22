package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSAlertHandle {
    public static void main(String[] args) {
        final String testUrl="https://the-internet.herokuapp.com/javascript_alerts";
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(testUrl);
        driver.manage().window().maximize();

        final By jsAlertbtn= By.xpath("//button[@onclick='jsAlert()']");
        final By jsAConfirmtbtn= By.xpath("//button[@onclick='jsConfirm()']");
        final By jsPromptbtn= By.xpath("//button[@onclick='jsPrompt()']");
        final By resultSelector = By.id("result");

        //Play with JS Alert
        driver.findElement(jsAlertbtn).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert content: " + alert.getText());

        alert.accept();
        System.out.println(driver.findElement(resultSelector).getText());


        //Play with JS confirm alert
        driver.findElement(jsAConfirmtbtn).click();
        alert =wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert content: " + alert.getText());
        alert.dismiss();
        System.out.println(driver.findElement(resultSelector).getText());

        //Play with JS Prompt Alert
        driver.findElement(jsPromptbtn).click();
        alert =wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("KKK");
        alert.accept();
        System.out.println(driver.findElement(resultSelector).getText());



    }
}
