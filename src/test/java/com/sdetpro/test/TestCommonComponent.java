package com.sdetpro.test;

import com.sdetpro.model.pages.LoginPage;
import com.sdetpro.ultis.Url;
import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.WebDriver;

public class TestCommonComponent {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Url.currentTestUrL("LOGIN_PAGE"));

        LoginPage loginPage=new LoginPage(driver);
        System.out.println(loginPage.footerComponent().pageFooter().getText());
        System.out.println(loginPage.footerComponent().pageFooterLinkText().getAttribute("href"));

    }
}
