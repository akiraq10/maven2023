package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicContentHandle {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("dynamic_controls"));
        driver.manage().window().maximize();

        By removeButtonSelector= By.cssSelector("#checkbox-example button");
        By checkBoxSelector= By.id("checkbox");
        By inputSelector= By.cssSelector("#input-example input");
        By enabledInputBtnSelector= By.cssSelector("#input-example button");

        System.out.println("Is the Checkbox displayed: " + driver.findElement(checkBoxSelector).isDisplayed());

        driver.findElement(removeButtonSelector).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkBoxSelector));
        try{
            driver.findElement(checkBoxSelector);
        }catch (Exception e){

            System.out.println("The checkbox was removed");
        }

        //Handel the input form
        System.out.println("Is the input form enabled: " + driver.findElement(inputSelector).isEnabled());
        driver.findElement(enabledInputBtnSelector).click();
        wait.until(ExpectedConditions.textToBe(enabledInputBtnSelector, "Disable"));
        System.out.println("Is the input form enabled: " + driver.findElement(inputSelector).isEnabled());

        driver.quit();

    }
}
