package com.telRan.trello.tests;

import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase

{



    @Test
    public void testCreateBoard()
    {
        app.getBoardHelper().createNewBoard();
        app.getBoardHelper().initNameBoard();

    }




    @Test
    public void getBoardsCount()
    {
        app.getBoardHelper().getBoardCount();

    }


    @Test
    public void getListBoards()
    {
        app.getBoardHelper().getListOfBoards();
    }

   /* @Test
    public int testBeforeAfter()
    {
        int before = getBoardsCount();
        testCreateBoard();
        int after = getBoardsCount();

        Assert.assertEquals(after, before +1);
    } */

}
