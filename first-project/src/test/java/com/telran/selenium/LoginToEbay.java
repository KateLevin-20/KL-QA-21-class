package com.telran.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase
{
    @Test
    public void loginTest()
    {
        openSite("https://ebay.com");
        initLogin();
        //init login

        fillLoginForm("tesla@test.com", "1223errt4");

        click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123werd");

        cliclkLoginButton();
    }


}
