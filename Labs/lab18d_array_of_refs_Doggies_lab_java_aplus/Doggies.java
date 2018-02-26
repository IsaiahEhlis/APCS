package lab18d_array_of_refs_Doggies_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class Doggies {

    private Dog[] pups;

    public Doggies(int size) {
        pups = new Dog[size];
    }

    public void add(int spot, int age, String name) {
        if (spot < pups.length) {
            pups[spot] = new Dog(age, name);
        }
    }

    public String getNameOfOldest() {
        Dog temp = pups[0];
        for (int i = 1; i < pups.length; i++) {
            if(pups[i].getAge() > temp.getAge()){
                temp = pups[i];
            }
        }
        return temp.getName();
    }

    public String getNameOfYoungest() {
        Dog temp = pups[0];
        for (int i = 1; i < pups.length; i++) {
            if(pups[i].getAge() < temp.getAge()){
                temp = pups[i];
            }
        }
        return temp.getName();
    }

    public String toString() {
        return "" + Arrays.toString(pups);
    }
}