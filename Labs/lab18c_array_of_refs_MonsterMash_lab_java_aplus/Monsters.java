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
import java.util.Collections;
import static java.util.Collections.*;

public class Monsters {

    private Monster[] myMonsters;

    public Monsters(int size) {
        myMonsters = new Monster[size];
    }

    public void add(int spot, Monster m) {
        myMonsters[spot] = m;
    }

    public Monster getLargest() {
        Monster temp = myMonsters[0];
        for (int i = 1; i < myMonsters.length; i++) {
            if(myMonsters[i].getHeight() > temp.getHeight()){
                temp = myMonsters[i];
            }   
        }
        return temp;
    }

    public Monster getSmallest() {
        Monster temp = myMonsters[0];
        for (int i = 1; i < myMonsters.length; i++) {
            if(myMonsters[i].getHeight() < temp.getHeight()){
                temp = myMonsters[i];
            }   
        }
        return temp;
    }
    
    public int getSmallestIndex() {
        Monster temp = myMonsters[0];
        int tempNum = 0;
        for (int i = 1; i < myMonsters.length; i++) {
            if(myMonsters[i].getHeight() < temp.getHeight()){
                temp = myMonsters[i];
                tempNum = i;
            }   
        }
        return tempNum;
    }
    
    public String toString() {
        return Arrays.toString(myMonsters);
    }
}