package lab24d_sortsearch_findmaxprime;


import java.util.*;
import java.io.*;

public class MatrixSearch2 {

    private int[][] mat;

    public MatrixSearch2(int rows, int cols, int upper) {
        mat = new int[rows][cols];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = (int)(Math.random() * (upper)) + 1;
            }
        }  
    }

    /*
     *findMaxPrime() will return the prime that has the largest surrounding sum
     */
    public int findMaxPrime() {
        int biggest = 1;
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                if(isPrime(mat[r][c]) && getCountRndCell(r, c) > biggest){
                    biggest = mat[r][c];
                }
            }
        }
        return biggest;
    }

    public int getCountRndCell(int r, int c) {
        int cnt = 0;
        if(inBounds(r-1, c-1)){
            cnt += mat[r-1][c-1];
        }
        if(inBounds(r-1, c)){
            cnt += mat[r-1][c];
        }
        if(inBounds(r-1, c+1)){
            cnt += mat[r-1][c+1];
        }
        if(inBounds(r, c-1)){
            cnt += mat[r][c-1];
        }
        if(inBounds(r, c+1)){
            cnt += mat[r][c+1];
        }
        if(inBounds(r+1, c-1)){
            cnt += mat[r+1][c-1];
        }
        if(inBounds(r+1, c)){
            cnt += mat[r+1][c];
        }
        if(inBounds(r+1, c+1)){
            cnt += mat[r+1][c+1];
        }
        return cnt;
    }

    private boolean inBounds(int r, int c) {
        if(r >= 0 && r < mat.length && c >= 0 && c < mat[r].length){
            return true;
        } else{
            return false;
        }
    }

    private boolean isPrime(int num) {
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String out = "";
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                if(mat[r][c] < 10){
                    out += "  " + mat[r][c];
                } else {
                    out += " " + mat[r][c];
                }
            }
            out += "\n";
        }
        out += "\nMax Prime " + findMaxPrime() + "\n\n";
        return out;
    }
}
