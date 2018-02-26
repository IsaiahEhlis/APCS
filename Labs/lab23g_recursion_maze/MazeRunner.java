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

public class MazeRunner {

    public static void main(String args[]) throws IOException {
        int[][] test1 = {{1, 0, 0, 0, 1},{1, 1, 1, 1, 0},{0, 0, 1, 0, 1},{0, 1, 1, 1, 0},{0, 0, 0, 0, 1}};
        int[][] test2 = {{1, 0, 0, 0, 0, 1, 1},{1, 1, 1, 1, 0, 1, 0},{0, 0, 1, 0, 0, 1, 0},{0, 1, 1, 1, 0, 1, 0},{0, 1, 0, 1, 0, 1, 0},{0, 1, 0, 1, 1, 1, 0},{0, 1, 0, 1, 0, 0, 1}};
        int[][] test3 = {{1, 0, 0, 0, 0, 1, 0},{1, 1, 1, 1, 0, 1, 0},{0, 0, 1, 0, 0, 1, 0},{0, 1, 1, 1, 0, 1, 0},{0, 1, 0, 1, 0, 1, 0},{0, 1, 0, 1, 1, 1, 0},{0, 1, 0, 1, 0, 1, 0}};
        int[][] test4 = {{1, 0, 1, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 0, 1, 0, 0, 0, 1},{0, 1, 1, 1, 1, 1, 1},{0, 1, 0, 1, 0, 1, 0},{1, 1, 1, 1, 1, 1, 0},{0, 1, 0, 1, 0, 1, 0}};
        int[][] test5 = {{1, 0, 1, 1, 0, 1, 0 ,1 ,1 ,1},{1, 1, 1, 1, 1, 1, 0, 1, 0, 1},{0, 0, 1, 0, 0, 0, 1, 1, 1, 1},{0, 1, 1, 1, 1, 1, 1, 1, 0, 1},{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},{1, 1, 1, 1, 1, 1, 0, 1, 1, 1},{0, 1, 0, 1, 0, 1, 0, 0, 0, 1},{0, 0, 1, 1, 0, 1, 0, 0, 0, 0},{0, 1, 0, 1, 0, 1, 0, 1, 1, 1},{0, 1, 1, 1, 1, 1, 0, 1, 1, 1}};
        int[][] test6 = {{1, 0, 1, 1, 0, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 1, 0, 1, 0, 1},{0, 0, 1, 0, 0, 0, 1, 1, 1, 0},{0, 1, 1, 1, 1, 1, 1, 1, 0, 1},{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},{1, 1, 1, 1, 1, 1, 0, 1, 1, 0},{0, 1, 0, 1, 0, 1, 0, 0, 0, 0},{0, 1, 1, 1, 0, 1, 0, 0, 1, 1},{0, 1, 0, 1, 0, 1, 0, 1, 1, 1},{0, 1, 1, 1, 1, 1, 0, 1, 1, 1}};
        Maze test = new Maze(5, test1);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
        test = new Maze(7, test2);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
        test = new Maze(7, test3);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
        test = new Maze(7, test4);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
        test = new Maze(10, test5);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
        test = new Maze(10, test6);
        System.out.print(test);
        if(test.hasExitPath(0, 0)){
            System.out.println("exit found");
            System.out.println("STEPS - " + test.getCount());
        } else{
            System.out.println("exit not found");
        }
        System.out.println("\n");
    }
}