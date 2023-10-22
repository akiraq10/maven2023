package com.sdetpro.ultis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver  {
    public final String Url="https://the-internet.herokuapp.com/";
    public static WebDriver getChromeDriver(){
//        String path = System.getProperty("user.dir");
//        String chromeDriverPath= path +"/src/test/resources/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static String getUrL(String subdirectory){
        String url="https://the-internet.herokuapp.com/" +subdirectory;
        return url;

    }

}
