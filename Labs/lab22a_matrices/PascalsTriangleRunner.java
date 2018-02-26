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

public class PascalsTriangleRunner {

    public static void main(String args[]) throws IOException {
        PascalsTriangle test1 = new PascalsTriangle(3);
        PascalsTriangle test2 = new PascalsTriangle(6);
        PascalsTriangle test3 = new PascalsTriangle(7);
        PascalsTriangle test4 = new PascalsTriangle(2);
        PascalsTriangle test5 = new PascalsTriangle(4);
        PascalsTriangle test6 = new PascalsTriangle(5);
        
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
    }
}
