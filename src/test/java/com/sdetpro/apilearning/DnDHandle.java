package com.sdetpro.apilearning;

import com.sdetpro.ultis.ElementController;
import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class DnDHandle {
    public static void main(String[] args) throws AWTException {
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(Webdriver.getUrL("drag_and_drop"));

        By leftColumnSelector= By.id("column-a");
        By rightColumnSelector= By.id("column-b");


        WebElement leftColumnElem= driver.findElement(leftColumnSelector);
        WebElement rightColumnElem= driver.findElement(rightColumnSelector);


        ElementController.dnd(leftColumnElem,rightColumnElem);
        ElementController.dnd(rightColumnElem,leftColumnElem);







    }
}
