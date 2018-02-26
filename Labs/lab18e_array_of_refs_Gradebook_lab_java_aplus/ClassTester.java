package lab18e_array_of_refs_Gradebook_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class ClassTester {

    public static void main(String args[]) {
        Class test = new Class("Comp Sci 1", 3);
        test.addStudent(0, new Student("Jimmy", "4 100.0 90.0 80.0 60.0"));
        test.addStudent(1, new Student("Sandy", "4 100.0 100.0 80.0 70.0"));
        test.addStudent(2, new Student("Fred", "4 50.0 50.0 70.0 68.0"));
        out.println(test);

        out.println(String.format(test.getStudentName(0) + "\'s average = %.2f", test.getStudentAverage(0)));
        out.println(String.format(test.getStudentName(1) + "\'s average = %.2f", test.getStudentAverage(1)));
        out.println(String.format(test.getStudentName(2) + "\'s average %.2f", test.getStudentAverage(2)));
        System.out.println("Sandy's average " + test.getStudentAverage("Sandy"));

        out.println("Failure List = " + test.getFailureList(70));
        out.println("Highest Average = " + test.getStudentWithHighestAverage());
        out.println("Lowest Average = " + test.getStudentWithLowestAverage());

        out.println(String.format("Class Average = %.2f", test.getClassAverage()));
    }
}