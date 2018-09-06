package com.telRan.trello.tests;

import com.telRan.trello.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeMethod
    public void setUp()
    {
        app.start();
    }

    @AfterMethod

    public void tearDown()
    {

        app.stop();
    }

}
