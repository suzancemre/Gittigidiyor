package com.gittigidiyor.homework.base;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest  {



    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/recources/chromedriver.exe");
        driver = new ChromeDriver();


         wait = new WebDriverWait(driver, Duration.ofSeconds(20));



    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
