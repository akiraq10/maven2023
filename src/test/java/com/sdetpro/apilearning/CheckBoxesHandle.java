package com.sdetpro.apilearning;


import com.sdetpro.ultis.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesHandle {
    public static void main(String[] args) {
        final String testUrl="https://the-internet.herokuapp.com/checkboxes";
        WebDriver driver= Webdriver.getChromeDriver();
        driver.get(testUrl);
        driver.manage().window().maximize();

        final int FIRST_CHECKBOX_INDEX=0;
        final int SECOND_CHECKBOX_INDEX=1;
        final By checkboxesXpath = By.xpath("//*[@type='checkbox']");

        //Check that the checkboxes or selected or not
        List<WebElement> checkboxesGroup = driver.findElements(checkboxesXpath);
        WebElement chckbx1Elem=checkboxesGroup.get(FIRST_CHECKBOX_INDEX);
        WebElement chckbx2Elem=checkboxesGroup.get(SECOND_CHECKBOX_INDEX);
        System.out.println("Is checkbox 1 selected: "+ chckbx1Elem.isSelected());
        System.out.println("Is checkbox 2 selected: "+chckbx2Elem.isSelected());


        //Try to select the first one
        System.out.println("=======01======");
        chckbx1Elem.click();
        System.out.println("Is checkbox 1 selected: "+ chckbx1Elem.isSelected());


        //try to unselect the second one
        System.out.println("=======02======");
        chckbx2Elem.click();
        System.out.println("Is checkbox 2 selected: "+chckbx2Elem.isSelected());

        //The try to reselect the second
        System.out.println("=======03======");
        chckbx2Elem.click();
        System.out.println("Is checkbox 2 selected: "+chckbx2Elem.isSelected());

        driver.quit();

    }
}
