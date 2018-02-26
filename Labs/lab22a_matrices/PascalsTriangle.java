package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle {

    private int[][] mat;

    public PascalsTriangle() {
    }

    public PascalsTriangle(int size) {
        mat = new int[size][size];
        
    }

    public void createTriangle() {
        for(int i = 0; i < mat.length; i++){
            mat[i][0] = 1;
            mat[mat.length - 1][mat.length - 1] = 1;
            for(int j = 1; j < mat[i].length - 1; j++){
                if(i >= 1){
                    mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
                }
            }
        }
    }

    public String toString() {
        createTriangle();
        String output = "";
        for(int i = 0; i < mat.length; i++){
            for(int x = 0; x < mat.length - i; x++){
                    output += " ";
            }
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] != 0){
                    output += mat[i][j] + " ";
                }
            }
            output += "\n";
        }
        return output;
    }
}