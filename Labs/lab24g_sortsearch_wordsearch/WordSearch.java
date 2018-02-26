package lab24g_sortsearch_wordsearch;


import java.util.*;
import java.io.*;

public class WordSearch {

    private char[][] m;

    public WordSearch(int size, String str) {
        m = new char[size][size];
        int i = 0;
        for(int r = 0; r < m.length; r++){
            for(int c = 0; c < m[r].length; c++){
                m[r][c] = str.charAt(i);
                i++;
            }
        }
    }

    public boolean isFound(String word) {
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j)  || checkDown(word, i, j) ||
                   checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkRight(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(c + i > w.length() - 1 || w.charAt(i) != m[r][c+i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkLeft(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if( c - i < 0 || w.charAt(i) != m[r][c-i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkUp(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r - i < 0 || w.charAt(i) != m[r-i][c]){
                return false;
            }
        }
        return true;
    }

    public boolean checkDown(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r + i > w.length() - 1 || w.charAt(i) != m[r+i][c]){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagUpRight(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r - i < 0 || c + i > w.length() - 1 || w.charAt(i) != m[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r - i < 0 || c - i < 0 || w.charAt(i) != m[r-i][c-i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r - i < 0 || c + i > w.length() - 1 || w.charAt(i) != m[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagDownRight(String w, int r, int c) {
        for(int i = 0; i < w.length(); i++){
            if(r + i > w.length() - 1 || c + i > w.length() - 1 || w.charAt(i) != m[r+i][c+i]){
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                output += m[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
