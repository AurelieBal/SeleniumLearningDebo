package com.telRan.trello.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase
{
    @BeforeMethod
    public void ensurePrecondition()
    {
        if (app.isLoggedIn())
        {
            app.getSessionHelper().logout();
        }
    }



    @Test

    public void testLogin()
    {
        app.getSessionHelper().logIn();


        Assert.assertTrue(app.isLoggedIn());
    }



    @Test

    public void testLoginNegative()
    {
        app.getSessionHelper().initLoginToTheAccount();
        app.getSessionHelper().fillLoginForm("edery.deborah@gmail.com", "Mikou99");
        app.getSessionHelper().submitLogin();

        Assert.assertFalse(app.isLoggedIn());

    }
}
