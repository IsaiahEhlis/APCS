package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab22i {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);

        out.print("How many matrices do you wish to enter? :: ");
        int matCnt = keyboard.nextInt();

        //instantiate a ThreeDRay

        for (int i = 0; i < matCnt; i++) {
            out.print("What is the size of matrix " + i + " : ");
            int size = keyboard.nextInt();

            int[][] mat = new int[size][size];
            out.println();
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    out.print("Enter a value for spot " + r + " - " + c + " :: ");
                    mat[r][c] = keyboard.nextInt();
                }
            }

            out.println("\nThreeDRay before setting mat at spot " + i);
            //print out the ThreeDRay - call toString()

            //call setMatrix

            out.println("\nThreeDRay after setting mat at spot " + i);
            //print out the ThreeDRay - call toString()

            //call setMatrix
        }

        int[][] ans = new int[0][0];  // = test.addMatrices(0,1);
        for (int[] row : ans) {
            for (int c : row) {
                out.print(c + " ");
            }
            out.println();
        }
    }
}