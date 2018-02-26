package lab24j_sortsearch_gradebook;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import lab18e_array_of_refs_Gradebook_lab_java_aplus.Student;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class StudentTester {

    public static void main(String args[]) {
        Student stu = new Student("Billy Bob", "5 - 90 85 95.5 77.5 88");
        out.println(stu);
        out.println("sum = " + stu.getSum());
        out.println("average = " + stu.getAverage());
        out.println("average after dropping low = " + stu.getAverageAfterDroppingLow());
        out.println("low grade = " + stu.getLowGrade());
        out.println("high grade = " + stu.getHighGrade() + "\n\n");


        Student other = new Student("Sally Sue", "3 - 100 100 99");
        out.println(other);
        out.println("sum = " + other.getSum());
        out.println("average = " + other.getAverage());
        out.println("average after dropping low = " + other.getAverageAfterDroppingLow());
        out.println("low grade = " + other.getLowGrade());
        out.println("high grade = " + other.getHighGrade() + "\n\n");

        out.println(stu.compareTo(other));
        out.println(other.compareTo(stu));
        out.println(other.compareTo(other));
    }
}