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

public class Grade {

    private double value;
    
    public Grade(){
        value = 0.0;
    }
    
    public Grade(double val){
        value = val;
    }
    
    public void setGrade(double grd){
        value = grd;
    }
    
    public double getGrade(){
        return value;
    }
    
    public String getLetterGrade(){
        if(value > 90){
            return "A";
        } else if (value > 80){
            return "B";
        } else if (value > 75){
            return "C";
        } else if (value > 70){
            return "D";
        }else {
            return "F";
        }
    }
    
    public double getNumericGrade(){
        return value;
    }
    
    public String toString(){
        return "" + value;
    }
    //add in set and get methods
    //String getLetterGrade()
    //double getNumericGrade()
    //toString method
}
