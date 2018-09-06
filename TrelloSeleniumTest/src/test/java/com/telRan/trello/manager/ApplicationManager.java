package com.telRan.trello.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private  SessionHelper sessionHelper;
    private BoardHelper boardHelper;
    WebDriver driver;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void start() {
        String browser = null;
        if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();

        } else if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://trello.com/");

        sessionHelper = new SessionHelper(driver);

        sessionHelper.logIn();
        boardHelper = new BoardHelper(driver);
    }

    public void stop() {
        driver.quit();
    }








    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }
}
