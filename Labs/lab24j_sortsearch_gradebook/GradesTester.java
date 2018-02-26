package lab24j_sortsearch_gradebook;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradesTester {

    public static void main(String args[]) {
        Grades test = new Grades("5 - 90 85 95.5 77.5 88");
        out.println(test);
        out.println("sum = " + test.getSum());
        out.println("num grades = " + test.getNumGrades());
        out.println("low grade = " + test.getLowGrade());
        out.println("high grade = " + test.getHighGrade());
    }
}