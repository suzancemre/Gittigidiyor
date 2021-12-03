package com.gittigidiyor.homework.page;

import com.gittigidiyor.homework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {


    public HomePage loginPerforms() throws InterruptedException {
        logger.info("Giriş yapılıyor.");
        driver.findElement(By.id("L-UserNameField")).sendKeys("suzi_018@hotmail.com");
        driver.findElement(By.id("L-PasswordField")).sendKeys("123456qwer");
        Thread.sleep(1000);
        driver.findElement(By.id("gg-login-enter")).click();
        return new HomePage();
    }

}
