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

public class Student {

    private String myName;
    private Grades myGrades;

    public Student() {
        setName("");
        setGrades("");
    }

    public Student(String name, String gradeList) {
        myName = name;
        myGrades = new Grades(gradeList);
    }

    public void setName(String name) {
        myName = name;
    }

    public void setGrades(String gradeList) {
        myGrades = new Grades(gradeList);
    }

    public void setGrade(int spot, double grade) {
        myGrades.setGrade(spot, grade);
    }

    public String getName() {
        return myName;
    }

    public int getNumGrades() {
        return myGrades.getNumGrades();
    }

    public double getSum() {
        return myGrades.getSum();
    }

    public double getAverage() {
        return myGrades.getAverage();
    }

    public double getAverageMinusLow() {
        return (myGrades.getSum() - myGrades.getLowGrade()) / ((double)myGrades.getNumGrades() -1);
    }

    public double getHighGrade() {
        return myGrades.getHighGrade();
    }
    
    public Grades getStudentGrades(){
        return myGrades;
    }

    public double getLowGrade() {
        return myGrades.getLowGrade();
    }

    public String toString() {
        return myName + " " + myGrades;
    }
}