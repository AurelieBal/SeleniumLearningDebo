package com.telRan.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase
{

    public SessionHelper(WebDriver driver) {
        super(driver);

    }

    public void logIn()
    {
        initLoginToTheAccount();
        fillLoginForm("edery.deborah@gmail.com", "Mikou999");
        submitLogin();
    }

    public void logout()
    {
        click(By.className("member-avatar"));
        click(By.cssSelector("a.js-logout"));
    }

    public void submitLogin()
    {
        click(By.cssSelector("input#login"));
    }

    public void fillLoginForm(String email, String password)
    {
        Type(email, By.id("user"));

        Type(password, By.id("password"));
    }

    public void initLoginToTheAccount()
    {
        click(By.xpath("//a[@class='global-header-section-button']"));
    }

    public boolean isLoggedIn()
    {
        return isElementPresent(By.className("member-avatar"));

    }
}
