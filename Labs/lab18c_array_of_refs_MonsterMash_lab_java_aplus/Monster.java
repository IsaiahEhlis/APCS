package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster {
    private int height;
    private int weight;
    private int age;
    
    public Monster(int ht, int wt, int ag){
        height = ht;
        weight = wt;
        age = ag;
    }
    
    public void setHt(int ht){
        height = ht;
    }
    
    public void setWt(int wt){
        weight = wt;
    }
        
    public void setAge(int ag){
        age = ag;
    }

    public int getHeight(){
        return height;
    }
    
    public String toString(){
        return height + " " + weight + " " + age;
    }
    //add stuff like methods and instance variables
}