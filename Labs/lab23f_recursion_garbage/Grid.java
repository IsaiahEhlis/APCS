package lab23f_recursion_garbage;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import lab22c_tictactoe.Cell;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid {

    private Cell[][] grid;

    public Grid() {
        setSize(0, 0);
    }

    public Grid(int rows, int cols) {
    }

    public void setSize(int rows, int cols) {
        grid = new Cell[rows][cols];
    }

    public void setSpot(int row, int col, Cell val) {
    }

    public Cell getSpot(int row, int col) {
        return grid[row][col];
    }

    public int getNumRows() {
        return grid.length;
    }

    public int getNumCols() {
        return grid[0].length;
    }

    public boolean drawGrid(Graphics window) {
        boolean full = true;

        //for loop for row
        for (int r = 0; r < grid.length; r++) {
            //for loop for col
            for (int c = 0; c < grid[r].length; c++) {
                Cell spot = grid[r][c];

                //if the current spot is not null


                //else

            }
        }
        return full;
    }

    public String toString() {
        String output = "";
        //for loop for row


        //for loop for col






        return output;
    }
}