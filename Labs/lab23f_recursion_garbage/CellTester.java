package lab23f_recursion_garbage;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import lab23e_recursion_GW_garbage.ColoredCell;
import lab22c_tictactoe.Cell;
import static java.lang.System.*;
import java.awt.Color;

public class CellTester {

    public static void main(String[] args) {
        Cell CellOne = new ColoredCell();
        out.println(CellOne);

        Cell redChecker = new ColoredCell(false);
        out.println(redChecker);

        Cell theShoe = new ColoredCell(100, 100, true);
        out.println(theShoe);

        Cell bishop = new ColoredCell(200, 200, 20, 20, true, Color.GREEN);
        out.println(bishop);
    }
}
