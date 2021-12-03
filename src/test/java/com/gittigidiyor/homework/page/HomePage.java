package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BasePage;
import com.gittigidiyor.homework.base.BaseTest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public HomePage login() {

        driver.findElement(By.xpath("//div[@class='gekhq4-8 iHquZr']")).click();
        return this;
    }

    public HomePage() {
        driver.get("https://www.gittigidiyor.com/");
        logger.info("test başladı");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gittigidiyor.com/");
        cerezKabul();

    }

    public HomePage cerezKabul() {
        try {
            driver.findElement(By.cssSelector("section.tyj39b-4.jZoSqD")).click();
        } catch (NoSuchElementException ignored) { }
        return this;
    }




    public LoginPage buttonClick(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("a[data-cy='header-login-button']")).click();
        return new LoginPage();

    }
       public HomePage hesabaTıkla(){
        driver.findElement(By.xpath("//div[@class='gekhq4-4 egoSnI']")).click();
        return this;
       }

       public IzlediklerimPage favorilereTıkla() throws InterruptedException {
        Thread.sleep(1000);
           Actions action = new Actions(driver);
           action.moveToElement(driver.findElement(By.cssSelector("[href='/hesabim/izlediklerim']")))
                   .click().build().perform();
        return new IzlediklerimPage();
       }
}
