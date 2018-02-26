package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe {

    private char[][] mat;

    public TicTacToe() {
    }

    public TicTacToe(String game) {
        mat = new char[3][3];
        for(int x = 0; x<3; x++){
            mat[0][x] = game.charAt(x);
        }
        for(int y = 0; y<3; y++){
            mat[1][y] = game.charAt(y + 3);
        }
        for(int z = 0; z<3; z++){
            mat[2][z] = game.charAt(z + 6);
        }
    }

    public String getWinner() {
        for(char[] row : mat){
            if(row[0] == 'X' && row[1] == 'X' && row[2] == 'X'){
                return "X wins horizontally!";
            }
            if(row[0] == 'O' && row[1] == 'O' && row[2] == 'O'){
                return "O wins horizontally!";
            }
        }
        for(int i = 0; i<3; i++){
            if(mat[0][i] == 'X' && mat[1][i] == 'X' && mat[2][i] == 'X'){
                return "X wins vertically!";
            }
            if(mat[0][i] == 'O' && mat[1][i] == 'O' && mat[2][i] == 'O'){
                return "O wins vertically!";
            }
        }
        boolean xDiag1 = true;
        boolean oDiag1 = true;
        for(int i = 0; i<3; i++){
            if(!(mat[i][i] == 'X')){
                xDiag1 = false;
            }
            if(!(mat[i][i] == 'O')){
                oDiag1 = false;
            }
        }
        if(xDiag1){
                return "X wins diagonally!";
        }
        if(oDiag1){
                return "O wins diagonally!";
        }
        
        boolean xDiag2 = true;
        boolean oDiag2 = true;
        for(int j = 2; j>=0; j--){
            if(!(mat[mat.length - 1 - j][j] == 'X')){
                xDiag2 = false;
            }
            
            if(!(mat[mat.length - 1 - j][j] == 'O')){
                oDiag2 = false;
            }
        }
        if(xDiag2){
                return "X wins diagonally!";
        }
        if(oDiag2){
                return "O wins diagonally!";
        }
        
        return "cat's game - no winner!";
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                output += mat[i][j];
            }
            output += "\n";
        }
        return output;
    }
}