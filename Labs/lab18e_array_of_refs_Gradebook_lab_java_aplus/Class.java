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

public class Class {

    private String name;
    private Student[] studentList;

    public Class() {
        name = "";
        studentList = new Student[0];
    }

    public Class(String nm, int stuCount) {
        name = nm;
        studentList = new Student[stuCount];
    }

    public void addStudent(int stuNum, Student s) {
        studentList[stuNum] = s;
    }
    

    public String getClassName() {
        return name;
    }

    public double getClassAverage() {
        double classAverage = 0.0;
        int numStudents = studentList.length;
        double total = 0.0;
        for(Student stu : studentList){
            total += stu.getAverage();
        }
        classAverage = total / numStudents;

        return classAverage;
    }

    public double getStudentAverage(int stuNum) {
        return studentList[stuNum].getAverage();
    }
    
    public double getStudentAverage(String nm){
        for (Student stu : studentList){
            if(stu.getName().equals(nm)){
                return stu.getAverage();
            }
        }
        return 0.0;    
    }

    public String getStudentName(int stuNum) {
        return studentList[stuNum].getName();
    }
    
    public Grades getStudentGrades(int stuNum){
       return studentList[stuNum].getStudentGrades();
    }
    
    public String getStudentWithHighestAverage() {
        double high = Double.MIN_VALUE;
        String hName = "";
        for(int i = 0; i < studentList.length; i++){
            if(high < studentList[i].getAverage()){
                high = studentList[i].getAverage();
                hName = studentList[i].getName();
            }
        }
        return hName;
    }

    public String getStudentWithLowestAverage() {
        double low = Double.MAX_VALUE;
        String lName = "";
        for(int i = 0; i<studentList.length; i++){
            if(studentList[i].getAverage() < low){
                low = studentList[i].getAverage();
                lName = studentList[i].getName();
            }
        }
        return lName;
    }

    public String getFailureList(double failingGrade) {
        String output = "";
        for(Student stu : studentList){
            if(stu.getAverage() < failingGrade){
                output += stu.getName();
            }
        }
        return output;
    }

    public String toString() {
        String output = "" + getClassName() + "\n";
        return output;
    }
}