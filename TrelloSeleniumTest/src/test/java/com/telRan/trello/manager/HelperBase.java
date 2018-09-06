package com.telRan.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void Type(String email, By locator)
    {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(email);
    }

    public void click(By locator)
    {
        driver.findElement(locator).click();
    }

    public boolean isElementPresent(By by)
    {
        try {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
}
