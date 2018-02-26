package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWord {

    private char[][] mat;

    public FancyWord(String s) {
        mat = new char[s.length()][s.length()];
        for(int a = 0; a < mat.length; a++){
            for(int b = 0; b < mat[0].length; b++){
                mat[a][b] = ' ';
            }
        }
        for(int x = 0; x < mat[0].length; x++){
            mat[0][x] = s.charAt(x);
        }
        for(int i = 1; i < s.length() - 1; i++){
            mat[i][s.length() - 1 - i] = s.charAt(s.length() - 1 - i);
            mat[i][i] = s.charAt(i);
        }
        for(int y = 0; y < mat[0].length; y++){
            mat[s.length() - 1][y] = s.charAt(y);
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