package com.wiki.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    WebDriver driver;
    SearchHelper searchHelper;
    LoginHelper loginHelper;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        searchHelper = new SearchHelper(driver);
        loginHelper = new LoginHelper(driver);

        searchHelper.openSite("https://en.wikipedia.org");

    }

    public void stop() {
        driver.quit();
    }

    public SearchHelper getSearch() {
        return searchHelper;
    }

    public LoginHelper getLogin() {
        return loginHelper;
    }
}
