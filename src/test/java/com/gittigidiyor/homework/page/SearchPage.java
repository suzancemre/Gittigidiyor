package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class SearchPage extends BaseTest {

    public SearchPage scroolDown(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        return this;
    }

    List<WebElement> tumUrunler;
    public SearchPage rastgeleUrunSecimi(){
        try {
            tumUrunler  = driver.findElements(By.cssSelector("div[data-cy=\"product-favorite\"]"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;

            Thread.sleep(1000);
            Random random = new Random();


            for(int i=0;i<4;i++){
                int rastgeleUrun  = random.nextInt(tumUrunler.size()-1);
                executor.executeScript("arguments[0].click();", tumUrunler.get(rastgeleUrun));//click on JS
                tumUrunler.remove(rastgeleUrun);
            }
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }

       return this;
    }
    public SearchPage clickProductSec() throws InterruptedException {
Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='sc-533kbx-0 sc-1v2q8t1-0 iCRwxx ixSZpI sc-1n49x8z-12 bhlHZl'])[" + 7 + "]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("add-to-basket")).click();
        Thread.sleep(4000);
        return this;
    }

public SepetimPage sepeteGit() throws InterruptedException {
        driver.findElement(By.cssSelector("span[class='basket-title']")).click();
        return new SepetimPage();
}


    public HomePage geriDön(){
        driver.findElement(By.xpath("//a[@title='GittiGidiyor']")).click();
        return new HomePage() ;
    }



}

