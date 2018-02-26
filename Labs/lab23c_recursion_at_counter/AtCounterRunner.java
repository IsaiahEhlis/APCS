package lab23c_recursion_at_counter;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class AtCounterRunner {

    public static void main(String args[]) {
        AtCounter test = new AtCounter();
        AtCounter test2 = new AtCounter();
        AtCounter test3 = new AtCounter();
        AtCounter test4 = new AtCounter();
        AtCounter test5 = new AtCounter();
        System.out.println("0,0 has " + test.countAts(0, 0) + " @'s connected");
        System.out.println(test);
        System.out.println("2,5 has " + test2.countAts(2, 5) + " @'s connected");
        System.out.println(test2);
        System.out.println("5,0 has " + test3.countAts(5, 0) + " @'s connected");
        System.out.println(test3);
        System.out.println("9,9 has " + test4.countAts(9, 9) + " @'s connected");
        System.out.println(test4);
        System.out.println("3,9 has " + test5.countAts(3, 9) + " @'s connected");
        System.out.println(test5);
    }
}