package com.sdetpro.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDashboard {
    private WebDriver driver;

    private By fashMsgSelector= By.id("flash-messages");
    private By pageHeaderSelector=By.tagName("h2");
    private By subHeaderSelector=By.cssSelector("subheader");
    private By logoutBtn=By.cssSelector(".example a");


    public UserDashboard(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getFashMsgSelector() {
        return driver.findElement(fashMsgSelector);
    }

    public WebElement getPageHeaderSelector() {
        return driver.findElement(pageHeaderSelector);
    }

    public WebElement getSubHeaderSelector() {
        return driver.findElement(subHeaderSelector);
    }

    public WebElement getLogoutBtn() {
        return driver.findElement(logoutBtn);
    }
}
