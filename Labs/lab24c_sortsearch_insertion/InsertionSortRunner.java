package lab24c_sortsearch_insertion;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class InsertionSortRunner {

    public static void main(String args[]) {
        InsertionSort test = new InsertionSort();
        
        test.add("tommy");
        test.add("bobby");
        test.add("annabell");
        test.add("sallysue");
        test.add("sallymae");
        test.add("alice");
        System.out.println(test);
        System.out.println("\n");
        
        test.remove("bobby");
        System.out.println(test);
        System.out.println("\n");
        
        test.remove("alice");
        System.out.println(test);
        System.out.println("\n");
        
        test.remove("fred");
        test.add("xylophone");
        System.out.println(test);
        System.out.println("\n");
        
        test.remove("tommy");
        System.out.println(test);
        System.out.println("\n");
        
        test.remove("fred");
        test.remove("annabell");
        test.remove("sallysue");
        System.out.println(test);
    }
}