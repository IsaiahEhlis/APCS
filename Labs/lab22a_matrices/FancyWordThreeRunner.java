package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public class FancyWordThreeRunner {

    public static void main(String args[]) throws IOException{
        Scanner file = new Scanner(new File("mofancyword.dat"));
        int size = file.nextInt();
        file.nextLine();
        for (int i = 0; i < size; i++) {
            String word = file.next();
            FancyWordThree test = new FancyWordThree(word);
            System.out.println(test);
        } 
    }
}