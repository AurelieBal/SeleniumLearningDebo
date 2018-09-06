package com.telRan.trello.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase
{


    static String BOARD_BUTTON_BYCSS = "span.tab__tabText__212hs";
    static String BOARD_TO_DELETE_BYXPATH = "//*[contains(text(),'Hellooooo!')]";
    static String DISPLAY_MENU_BYCSS = "span.board-header-btn-text u-text-underline";
    static String MORE_OPTIONS_BYCSS = "a.board-menu-navigation-item-link js-open-more";
    static String CLOSE_BOARD_BYCSS = "a.board-menu-navigation-item-link js-close-board";
    static String CONFIRMED_CLOSE_BYXPATH = "//input[@value='Fermer']";

    @Test
    public void testDeleteBoard()
    {
        app.getSessionHelper().click(By.cssSelector(BOARD_BUTTON_BYCSS));
        app.getSessionHelper().click(By.xpath(BOARD_TO_DELETE_BYXPATH));
        app.getSessionHelper().click(By.cssSelector(DISPLAY_MENU_BYCSS));
        app.getSessionHelper().click(By.cssSelector(MORE_OPTIONS_BYCSS));
        app.getSessionHelper().click(By.cssSelector(CLOSE_BOARD_BYCSS));
        app.getSessionHelper().click(By.xpath(CONFIRMED_CLOSE_BYXPATH));

    }



}
