package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHoverHandle {
    public static void main(String[] args) {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("hovers"));
        driver.manage().window().maximize();

        By avatarSelector = By.xpath("//*[@class='figure']");
        By usernameSelectot = By.xpath("//*[@class='figure']//h5");
        By usernameHyperLink = By.xpath("//*[@class='figure']//a");

        final int USER_1_INDEX=0;
        final int USER_2_INDEX=1;
        final int USER_3_INDEX=2;

        List<WebElement> userAvatarElem =driver.findElements(avatarSelector);
        List<WebElement> usernameElem =driver.findElements(usernameSelectot);
        List<WebElement> userhyperLinkElem =driver.findElements(usernameHyperLink);

        Actions actions=new Actions(driver);

        //Move mouser on the fisrt user
        actions.moveToElement(userAvatarElem.get(USER_1_INDEX)).perform();
        System.out.println(usernameElem.get(USER_1_INDEX).getText());
        System.out.println(userhyperLinkElem.get(USER_1_INDEX).getAttribute("href"));

        //Move mouser on the second user
        actions.moveToElement(userAvatarElem.get(USER_2_INDEX)).perform();
        System.out.println(usernameElem.get(USER_2_INDEX).getText());
        System.out.println(userhyperLinkElem.get(USER_2_INDEX).getAttribute("href"));

        //Move mouser on the third user
        actions.moveToElement(userAvatarElem.get(USER_3_INDEX)).perform();
        System.out.println(usernameElem.get(USER_3_INDEX).getText());
        System.out.println(userhyperLinkElem.get(USER_3_INDEX).getAttribute("href"));

        driver.quit();


    }

}
