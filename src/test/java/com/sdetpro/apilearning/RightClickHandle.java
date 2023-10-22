package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RightClickHandle {
    public static void main(String[] args) {
//        final String testUrl="https://the-internet.herokuapp.com/context_menu";
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("context_menu"));
        driver.manage().window().maximize();

        By rightClickPalce=By.id("hot-spot");
        Actions actions = new Actions(driver);
        WebElement rightClickPlaceElem=driver.findElement(rightClickPalce);
        actions.contextClick(rightClickPlaceElem).perform();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        Alert alert =wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();

        driver.navigate().refresh();


        driver.quit();
    }
}
