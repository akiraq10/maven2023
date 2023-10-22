package com.sdetpro.apilearning;

import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("windows"));

        By clickHereLinkText= By.linkText("Click Here");
        WebElement linktextElem=driver.findElement(clickHereLinkText);

        linktextElem.click();
        List<String> windowsIds=new ArrayList<>(driver.getWindowHandles());
        System.out.println("Current windows: " + windowsIds.size());
        final int FIRST_WINDOWS=0;
        final int SECOND_WINDOWS=1;

        driver.switchTo().window(windowsIds.get(SECOND_WINDOWS));
        System.out.println("Second windows URL : "+ driver.getCurrentUrl());
        System.out.println("Second windows Tile : "+ driver.getTitle());


        //Switch to the 1st windows
        driver.switchTo().window(windowsIds.get(FIRST_WINDOWS));
        System.out.println("1st windows URL : "+ driver.getCurrentUrl());
        System.out.println("1st windows Tile : "+ driver.getTitle());

        //Close the second window
        driver.switchTo().window(windowsIds.get(SECOND_WINDOWS));
        driver.close();

        //Switch to the 1st page
        driver.switchTo().window(windowsIds.get(FIRST_WINDOWS));
        windowsIds=new ArrayList<>(driver.getWindowHandles());
        System.out.println("Current Windows: " + windowsIds.size());

        driver.quit();

    }
}
