package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
    public static void main(String[] args) {
        final String testUrl="https://the-internet.herokuapp.com/dropdown";
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(testUrl);
        driver.manage().window().maximize();

        final By dropdownSelector = By.id("dropdown");

        Select select=new Select(driver.findElement(dropdownSelector));
        select.selectByVisibleText("Option 1");
        select.selectByValue("2");
        select.selectByIndex(1);
    }
}
