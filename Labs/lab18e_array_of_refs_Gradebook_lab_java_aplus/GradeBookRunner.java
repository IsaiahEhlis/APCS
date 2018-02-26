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

public class GradeBookRunner {

    public static void main(String args[]) {
        out.println("Welcome to the Class Stats program!");

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the name of this class? ");
        String name = keyboard.nextLine();
        System.out.println("\nHow many students are in the class? ");
        int numStudents = keyboard.nextInt();
        Class test = new Class(name, numStudents);
        keyboard.nextLine();
        
        for(int i = 0; i < numStudents;i++ ){
            System.out.println("Enter the name of student " + (i + 1) + " : ");
            String stuName = keyboard.nextLine();
            System.out.println("Enter the grades for " + stuName + "\nUse the format x grades( 2 100 100) : ");
            String stuGrades = keyboard.nextLine();
            test.addStudent(i, new Student(stuName, stuGrades));
            System.out.println("");
        }
        
        System.out.println(test);
        for(int i = 0; i < numStudents; i++){
            System.out.println(test.getStudentName(i) + " = " + test.getStudentGrades(i) + " " + test.getStudentAverage(i));
        }
        System.out.println("\nFailure List = " + test.getFailureList(70.0));
        System.out.println("Highest Average = " + test.getStudentWithHighestAverage());
        System.out.println("Lowest Average = " + test.getStudentWithLowestAverage());
        System.out.println("Class Average = " + test.getClassAverage());
    }
}