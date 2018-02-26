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

public class Grades {

    private Grade[] grades;
    private int x = 0;
    

    public Grades(String gradeList) {
        Scanner keyboard = new Scanner(gradeList);
        int nInt = keyboard.nextInt();
        grades = new Grade[nInt];
        for (int i = 0; i < grades.length; i++) {
            addGrade((keyboard.nextDouble()));
        }
    }

    public void addGrade(double grade) {
        grades[x] = new Grade(grade);
        x++;
    }

    public void setGrade(int spot, double grade) {
        grades[spot] = new Grade(grade);
    }

    public double getSum() {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i].getGrade();
        }
        return sum;
    }

    public double getLowGrade() {
        double low = Double.MAX_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getGrade() < low){
                low = grades[i].getGrade();
            } 
        }
        return low;
    }

    public double getHighGrade() {
        double high = Double.MIN_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getGrade() > high){
                high = grades[i].getGrade();
            } 
        }
        return high;
    }
    
    public double getAverage(){
        int nNums = grades.length;
        return getSum() / (double)nNums;
    }

    public int getNumGrades() {
        return grades.length;
    }

    public String toString() {
        return Arrays.toString(grades);
    }
}