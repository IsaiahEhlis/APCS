package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner {

    public static void main(String args[]) throws IOException {
        MatrixSumming test = new MatrixSumming(5,5);
        int[] row1 = {1, 2, 3, 4, 5};
        int[] row2 = {6, 7, 8, 9, 0};
        int[] row3 = {6, 7, 1, 2, 5};
        int[] row4 = {6, 7, 8, 9, 0};
        int[] row5 = {5, 4, 3, 2, 1};
        test.setRow(row1);
        test.setRow(row2);
        test.setRow(row3);
        test.setRow(row4);
        test.setRow(row5);
        
        System.out.println("The sum of 2,2 is " + test.sum(2, 2));
        System.out.println("The sum of 0,0 is " + test.sum(0, 0));
        System.out.println("The sum of 4,3 is " + test.sum(4, 3));
        System.out.println("The sum of 4,4 is " + test.sum(4, 4));
        System.out.println("The sum of 2,4 is " + test.sum(2, 4));
        System.out.println("The sum of 1,3 is " + test.sum(1, 3));
    
    
    }
}

