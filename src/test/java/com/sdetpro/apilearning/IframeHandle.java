package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeHandle {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("iframe"));

        By iframeNodeSelector = By.id("mce_0_ifr");
        By iframeBodySelector = By.id("tinymce");

        WebElement iframeElem= driver.findElement(iframeNodeSelector);
        driver.switchTo().frame(iframeElem);

        WebElement iframeBodyElem= driver.findElement(iframeBodySelector);
        iframeBodyElem.clear();
        iframeBodyElem.sendKeys("hello a zino moto");

        //switch back to the main frame
        driver.switchTo().defaultContent();

        driver.quit();




    }
}
