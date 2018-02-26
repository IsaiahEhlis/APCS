package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner {

    public static void main(String args[]) throws IOException {
        TicTacToe test1 = new TicTacToe("XXXOOXXOO");
        TicTacToe test2 = new TicTacToe("OXOOXOXOX");
        TicTacToe test3 = new TicTacToe("OXOXXOXOO");
        TicTacToe test4 = new TicTacToe("OXXOXOXOO");
        TicTacToe test5 = new TicTacToe("XOXOOOXXO");
        
        System.out.println(test1);
        System.out.println(test1.getWinner());
        System.out.println("");
        
        System.out.println(test2);
        System.out.println(test2.getWinner());
        System.out.println("");
        
        System.out.println(test3);
        System.out.println(test3.getWinner());
        System.out.println("");
        
        System.out.println(test4);
        System.out.println(test4.getWinner());
        System.out.println("");
        
        System.out.println(test5);
        System.out.println(test5.getWinner());
        System.out.println("");
    }
}