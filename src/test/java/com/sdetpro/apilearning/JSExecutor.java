package com.sdetpro.apilearning;

import com.sdetpro.ultis.PageController;
import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSExecutor {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("floating_menu"));
        driver.manage().window().maximize();

        By menuSelector=By.id("menu");

        //Scroll to the bottom
        PageController.scrollToBottom(driver);
        System.out.println(PageController.isElementInViewPort(driver, driver.findElement(menuSelector)));

        driver.quit();

    }
}
