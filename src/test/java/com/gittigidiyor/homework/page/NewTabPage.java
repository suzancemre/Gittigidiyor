package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewTabPage extends BaseTest {

    public HomePage hesabaTıkla(){
        driver.findElement(By.xpath("//div[@class='gekhq4-4 egoSnI']")).click();
        return new HomePage();
    }


    public IzlediklerimPage favorilereTıkla() throws InterruptedException {
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[href='/hesabim/izlediklerim']")))
                .click().build().perform();
        return new IzlediklerimPage();
    }


public NewTabPage cikisYap() throws InterruptedException {
        Actions actions = new Actions(driver) ;
    String currentWindow = driver.getWindowHandle();
    Set<String> windowsHandles = driver.getWindowHandles();
    By cikisButon = By.xpath("//a[@title=\"Çıkış\"]");


    Thread.sleep(3000);

    actions.moveToElement(driver.findElement(By.xpath("//div[@title='Hesabım']"))).build().perform();
    Thread.sleep(2000);

    actions.moveToElement(driver.findElement(cikisButon)).doubleClick().build().perform();

    driver.switchTo().window(currentWindow);

    Thread.sleep(3000);
    return this;
}//

}
