package lab18d_array_of_refs_Doggies_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many Dogs are in the pack? :: ");
        int size = keyboard.nextInt();
        Doggies pack = new Doggies(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the age :: ");
            int age = keyboard.nextInt();
            System.out.print("Enter the name :: ");
            String name = keyboard.next();
            pack.add(i, age, name);
        }
        System.out.println("pack :: " + pack);
        System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
        System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());
    }
}