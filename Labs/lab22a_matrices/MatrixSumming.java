package lab22a_matrices;


import java.util.*;
import java.io.*;

public class MatrixSumming {

    private int[][] m;
    private int r;
    
    public MatrixSumming(int rows, int col){
        m = new int[rows][col];
    }
    
    public void setRow(int[] row){
        m[r] = row;
        r++;
    }

    public int sum(int r, int c) {
        int sum = 0;
        
        sum+=m[r][c];
        if(r != 0 && c != 0 && r != m.length - 1 && c != m[r].length - 1){
            sum+=m[r+1][c];
            sum+=m[r+1][c+1];
            sum+=m[r+1][c-1];
            sum += m[r][c+1];
            sum+=m[r][c-1];
            sum += m[r-1][c-1];
            sum+=m[r-1][c];
            sum+=m[r-1][c+1];
        }
        if(r == 0 && c==0){
            sum+=m[r+1][c];
            sum+=m[r+1][c+1];
            sum += m[r][c+1];
        }
        if(r == 0 && c==m[r].length - 1){ //top right
            sum+=m[r+1][c];
            sum+=m[r+1][c-1];
            sum+=m[r][c-1];
        }
        if(r == m.length - 1 && c==0){ //bottom left
            sum += m[r][c+1];
            sum+=m[r-1][c];
            sum+=m[r-1][c+1];
        }
        if(r == m.length - 1 && c==m[r].length - 1){
            sum+=m[r][c-1];
            sum += m[r-1][c-1];
            sum+=m[r-1][c];
        }
        
        if(r != 0 && r != m.length - 1 && c == 0){//left wall
            sum+=m[r+1][c];
            sum+=m[r+1][c+1];
            sum += m[r][c+1];
            sum+=m[r-1][c];
            sum+=m[r-1][c+1];
        }
        if(r == 0 && c != m[r].length - 1 && c != 0){//top wall
            sum+=m[r+1][c];
            sum+=m[r+1][c+1];
            sum+=m[r+1][c-1];
            sum += m[r][c+1];
            sum+=m[r][c-1];
        }
        if(r == m.length - 1 && c != 0 && c != m[r].length - 1){  //bottom wall
            sum += m[r][c+1];
            sum+=m[r][c-1];
            sum += m[r-1][c-1];
            sum+=m[r-1][c];
            sum+=m[r-1][c+1];
        }
        if(c == m[r].length - 1 && r != 0 && r != m.length - 1){ //right wall
            sum+=m[r+1][c];
            sum+=m[r+1][c-1];
            sum+=m[r][c-1];
            sum += m[r-1][c-1];
            sum+=m[r-1][c];
        }
        
        return sum;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                output += m[i][j];
            }
            output += "\n";
        }
        return output;
    }
}
