package lab23f_recursion_garbage;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import lab23e_recursion_GW_garbage.ColoredCell;
import lab22a_matrices.Grid;
import static java.lang.System.*;
import java.awt.Color;

public class GridTester {

    public static void main(String[] args) {
        Grid gridTest = new Grid(2, 2);

        out.println(gridTest.getNumRows());
        out.println(gridTest.getNumCols());

        gridTest.setSpot(0, 0, new ColoredCell(3, 3, false));
        out.println(gridTest);

        gridTest.setSpot(1, 1, new ColoredCell(100, 100, 4, 4, true));
        out.println(gridTest);

        gridTest.setSpot(1, 1, new ColoredCell(200, 200, 20, 20, false, Color.RED));
        out.println(gridTest);

        out.println(gridTest.getSpot(1, 0));
        out.println(gridTest.getSpot(0, 1));
    }
}
