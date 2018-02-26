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
import java.io.File;

public class GradeBookFileRunner {

    public static void main(String args[]) throws Exception {
        out.println("Welcome to the Class Stats program!");

        Scanner file = new Scanner(new File("gradebook.dat"));
        String name = file.nextLine();
        int numStudents = file.nextInt();
        Class test = new Class(name, numStudents);
        for(int i = 0; i < numStudents; i++){
            String stuName = file.nextLine();
            String stuGrades = file.nextLine();
            test.addStudent(i, new Student(stuName, stuGrades));
        }
        for(int i = 0; i < numStudents; i++){
            System.out.println(test.getStudentName(i) + " = " + test.getStudentGrades(i) + " " + test.getStudentAverage(i));
        }
        System.out.println("\nFailure List = " + test.getFailureList(70.0));
        System.out.println("Highest Average = " + test.getStudentWithHighestAverage());
        System.out.println("Lowest Average = " + test.getStudentWithLowestAverage());
        System.out.println("Class Average = " + test.getClassAverage());


    }
}