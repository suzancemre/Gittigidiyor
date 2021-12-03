package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BasePage;
import com.gittigidiyor.homework.base.BaseTest;
import org.openqa.selenium.By;

import static com.gittigidiyor.homework.base.BaseTest.driver;

public class SepetimPage extends BasePage {


    public SepetimPage artırSepeti(){
        driver.findElement(By.xpath("//select[@class='amount']")).click();
        driver.findElement(By.xpath("//option[@value='2']")).click();
        return this;
    }
    public AdresPage odemeYap(){
        driver.findElement(By.xpath("//input[@class='gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay']")).click();
        return new AdresPage();
    }


    public HomePage anasayfayaGeridon() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@title='Alışveriş Sitesi']")).click();
        return new HomePage() ;
    }


}
