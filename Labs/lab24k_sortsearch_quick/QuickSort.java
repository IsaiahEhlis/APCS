package lab24k_sortsearch_quick;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -  

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort {

    private static int passCount;

    public static void quickSort(Comparable[] list) {
        passCount = 0;
        quickSort(list, 0, list.length-1);
    }

    private static void quickSort(Comparable[] list, int low, int high) {
            int divide = partition(list, low, high);
            System.out.println("pass " + passCount + Arrays.toString(list));
            passCount++;
            if(low < divide - 1){
                quickSort(list, low, divide-1);
            }
            if(high > divide){
                quickSort(list, divide, high);
            }
    }

    private static int partition(Comparable[] list, int low, int high) {
        Comparable pivot = list[low];
        int bottom = low;
        int top = high;
        while(bottom <= top) {
            while (list[bottom].compareTo(pivot) < 0){
                bottom++;
            }
            while (list[top].compareTo(pivot) > 0){
                top--;
            }
            if(bottom <= top){
                Comparable temp = list[bottom];
                list[bottom] = list[top];
                list[top] = temp;
                
                bottom++;
                top--;
            }
        }
        return bottom;
    }
}