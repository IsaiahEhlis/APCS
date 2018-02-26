package lab24j_sortsearch_gradebook;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  - 

import lab07a_if_else_if_labs.Grade;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeTester {

    public static void main(String args[]) {
        Grade gr = new Grade(90);
        out.println(gr);

        gr = new Grade(83);
        out.println(gr);

        gr = new Grade(78.4);
        out.println(gr);

        gr = new Grade(33);
        out.println(gr);

        gr = new Grade(73);
        out.println(gr);

        gr = new Grade(61.4);
        out.println(gr);
    }
}