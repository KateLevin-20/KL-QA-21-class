package com.wiki.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    WebDriver driver;
    SearchHelper searchHelper;
    LoginHelper loginHelper;

    public String browser;

    public  ApplicationManager(String browser)
    {

        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        } if(browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        } if(browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }

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
