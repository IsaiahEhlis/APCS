package lab24l_sortsearch_matrix;


import java.util.*;
import java.io.*;

public class MatrixSearch {

    private int[][] mat;

    /*
     *pre - mat is null
     *post - mat will be rows X cols
     *post - mat will contain integers that are <= upper and >= 1
     */
    public MatrixSearch(int rows, int cols, int upper) {
        mat = new int[rows][cols];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = (int)(Math.random() * (upper)) + 1;
            }
        }  
    }


    /*
     *pre - mat is not null
     *post - count of odd numbers will be returned
     *post - no values in mat will have been changed
     */
    public int countOdds() {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] % 2 == 1){
                    count ++;
                }
            }
        }
        return count;
    }


    /*
     *pre - mat is not null
     *post - count of even numbers will be returned
     *post - no values in mat will have been changed
     */
    public int countEvens() {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] % 2 == 0){
                    count ++;
                }
            }
        }
        return count;
    }


    /*
     *pre - mat is not null
     *post - count of prime numbers will be returned
     *post - no values in mat will have been changed
     */
    public int countPrimes() {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(isPrime(mat[i][j])){
                    count ++;
                }
            }
        }
        return count;
    }

    /*
     *pre - num has a value
     *post - false is returned if num is divisble by any number between 2 and itself
     *post - true is returned if num is not divisble by any number between 2 and itself
     */
    private boolean isPrime(int num) {
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
     *pre - mat is not null
     *post - all values from mat are concatenated to a string and returned
     */
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
        out += "\nOdd count = " + countOdds();
        out += "\nEven count = " + countEvens();
        out += "\nPrime count = " + countPrimes() + "\n\n";
        return out;
    }
}
