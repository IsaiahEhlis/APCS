package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwo {

    private char[][] mat;

    public FancyWordTwo(String s) {
        mat = new char[s.length()][s.length()];
        for(int a = 0; a < mat.length; a++){
            for(int b = 0; b < mat[0].length; b++){
                mat[a][b] = ' ';
            }
        }
        for(int x = 0; x < mat.length; x++){
            mat[0][x] = s.charAt(x);
        }
        for(int i = 1; i < mat.length - 1; i++){
            mat[i][0] = s.charAt(i);
            mat[i][mat.length - 1] = s.charAt(mat.length - 1 - i);
        }
        for(int j = 0; j < mat.length; j++){
            mat[mat.length - 1][j] = s.charAt(mat.length - 1 - j);
        }
        //use a for loop to load in the letters into the matrix
    }

    public String toString() {
        String output = "";
        for(char[] row : mat){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println("");
        }
        return output + "\n\n";
    }
}