package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BasePage;
import com.gittigidiyor.homework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class AdresPage extends BasePage {

    public AdresPage adresButonaKaydet(){
        driver.findElement(By.xpath("//button[@class='gg-ui-btn-primary gg-btn post-address gg-ui-btn-fluid post-address-button gg-ui-btn-lg']")).click();
        return this;

    }
    public SepetimPage sepetDuzenle() throws InterruptedException {
        logger.info("Sepete düzenleye gidiliyor");
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector(".header-link[href='https://www.gittigidiyor.com/sepetim']")))
                .click().build().perform();
        return new SepetimPage();
    }

}
