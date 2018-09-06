package com.telRan.trello.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BoardHelper extends HelperBase
{
    static String PLUS_BUTTON_BYCSS ="a.js-open-add-menu";
    static String CREATE_BOARD_BUTTON_BYCSS = "span.sub-name";
    static String ADD_TITLE_BYCSS = "input.subtle-input";
    static String CREATE_BOARD_BYXPATH ="//button[@type='submit']";
    static String HOME_BUTTON_BYCSS ="span.icon-house.header-btn-icon";

    public BoardHelper(WebDriver driver) {
        super(driver);
    }

    public void getBoardCount() {
        int boardsCount =  driver.findElements(By.cssSelector("div.is-badged")).size();

        System.out.println(boardsCount);
    }

    public void getListOfBoards() {
        List<WebElement> boards = driver.findElements(By.cssSelector("div.is-badged"));
        for(WebElement board : boards)
        {
            String title = board.getText();
            System.out.println(title);
        }
    }
    public void createNewBoard() {
        click(By.cssSelector(PLUS_BUTTON_BYCSS));
        click(By.cssSelector(CREATE_BOARD_BUTTON_BYCSS));
    }

    public void initNameBoard() {
       click(By.cssSelector(ADD_TITLE_BYCSS));
       Type("New Board Test", By.cssSelector(ADD_TITLE_BYCSS));
       click(By.xpath(CREATE_BOARD_BYXPATH));
       click(By.cssSelector(HOME_BUTTON_BYCSS));
    }

}
