package com.joshua;

/**
 * Created by jgchoi.qa on 2017. 4. 18..
 */
public class Game implements Play {
    private static int[][] gameArray = new int[4][4];

    @Override
    public void drawGame() {

    }

    @Override
    public boolean numberGenerate() {
        return false;
    }

    @Override
    public boolean rotateUp() {
        return false;
    }

    @Override
    public boolean rotateDown() {
        return false;
    }

    @Override
    public boolean rotateLeft() {
        return false;
    }

    @Override
    public boolean rotateRight() {
        return false;
    }
}
