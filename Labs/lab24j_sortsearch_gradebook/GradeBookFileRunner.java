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
import java.io.File;

public class GradeBookFileRunner {

    public static void main(String args[]) throws Exception {
        out.println("Welcome to the Class Stats program!");

        Scanner file = new Scanner(new File("gradebook.dat"));
        String className = file.nextLine();
        int numStudents = file.nextInt();
        file.nextLine();

        Class theClass = new Class(className, numStudents);

        for (int i = 0; i < numStudents; i++) {
            String stuName = file.nextLine();
            String gradeList = file.nextLine();
            theClass.addStudent(i, new Student(stuName, gradeList));
        }

        out.println("\n\n" + theClass);
        theClass.sort();

        out.println("\n\n" + theClass);

        out.println("Failure List = " + theClass.getFailureList(70));
        out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
        out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());

        out.println("Class average = " + theClass.getClassAverage());
    }
}