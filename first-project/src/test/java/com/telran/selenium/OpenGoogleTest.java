package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest extends TestBase{
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("https://www.google.com");

    }

    @Test
    public void searchJavaTest() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("java"+ Keys.ENTER);
        // driver.navigate();

        Thread.sleep(7000);
    }
@Test
public void clickImFeelingLucky() {

        new Actions(driver).moveToElement(driver.findElement(By.name("btnI"))).click().perform();


        driver.findElement(By.name("btnI")).click();
}
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
