package com.gittigidiyor.homework.base;

import com.gittigidiyor.homework.page.SearchPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class BasePage extends BaseTest{

    protected String currentWindow;
    protected Logger logger = Logger.getLogger(BasePage.class);

public SearchPage clickButton() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[data-cy='header-search-input']")).sendKeys("tabak");
    driver.findElement(By.cssSelector("button[data-cy='search-find-button']")).click();
    return new SearchPage();

}
public SearchPage clickProduct() throws InterruptedException {
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[data-cy='header-search-input']")).sendKeys("Çanta");
    driver.findElement(By.cssSelector("button[data-cy='search-find-button']")).click();
    return new SearchPage();
}

    }


