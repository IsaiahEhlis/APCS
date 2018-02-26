package lab23g_recursion_maze;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze {

    private int[][] maze;

    public Maze(int size, int[][] mat) {
        maze = new int[size][size];
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                maze[i][j] = mat[i][j];
            }
        }
    }

    int count = 0;
    public boolean hasExitPath(int r, int c) {
        if(r >= 0 && c >= 0 && r <= maze.length-1 && c <= maze[r].length-1 && maze[r][c] == 1){
            count++;
            maze[r][c] = 2;
            if(c == maze[r].length - 1){
                return true;
            }else{
                return false || hasExitPath(r-1, c) || hasExitPath(r+1, c) || hasExitPath(r, c+1) || hasExitPath(r, c-1);
            }
        }
        return false;
    }

    public int getCount(){
        return count;
    }
    
    public String toString() {
        String output = "";
        for(int[] row : maze){
            for(int col : row){
                output += col + " ";
            }
            output+="\n";
        }
        return output;
    }
}