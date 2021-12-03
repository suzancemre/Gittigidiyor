package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BasePage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Set;

public class IzlediklerimPage extends BasePage {

    By anasayfaButonu = By.xpath("//a[@class=\"header-gg-logo robot-header-logoContainer-logo\"]");

    public IzlediklerimPage favorilerdenSepeteEkle() throws InterruptedException {
driver.findElement(By.xpath("(//a[@title='Sepete Ekle'])[2]")).click();
Thread.sleep(1000);
//driver.findElement(By.xpath("//a[@title='Sepete Ekle']")).click();
        return this;
    }

    public IzlediklerimPage favorilerdenSil() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"))).click().build().perform();
        //driver.findElement(By.id("watch-products-item-checkbox-0")).click();
        driver.findElement(By.xpath("//button[@class='delete-watch-products robot-delete-all-button']")).click();
        return this;
    }

    public NewTabPage sekmeAc() throws InterruptedException {
    Thread.sleep(1000);
        currentWindow = driver.getWindowHandle();

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(anasayfaButonu)).keyDown(Keys.CONTROL).click().build().perform();

        actions.keyUp(Keys.CONTROL).build().perform();

        Set<String> windowsHandles = driver.getWindowHandles();
        for (String pencere : windowsHandles){
            if(!currentWindow.equals(pencere)){
                driver.switchTo().window(pencere);
            }
        }


        //driver.switchTo().window(driver.getWindowHandles().iterator().next());
        //driver.switchTo().window(currentWindow);

        return new NewTabPage();

    }
}
