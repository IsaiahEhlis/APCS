package lab24e_sortsearch_merge;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort {

    private static int passCount;

    public static void mergeSort(Comparable[] list) {
        passCount = 0;
        mergeSort(list, 0, list.length);
    }

    private static void mergeSort(Comparable[] list, int front, int back) //O( Log N )
    {
        int mid = (front + back) / 2;
        if(mid == front) return;
        mergeSort(list, front, mid);
        mergeSort(list, mid, back);
        merge(list, front, back);
        System.out.println("pass " + passCount + Arrays.toString(list));
        passCount++;
    }

    private static void merge(Comparable[] list, int front, int back) //O(N)
    {
        Comparable[] temp = new Comparable[back - front];
        int i = front;
        int j = (front + back) / 2;
        int k = 0;
        int mid = j;
        while(i < mid && j < back){
            if(list[i].compareTo(list[j]) < 0){
                temp[k++] = list[i++];
            }else{
                temp[k++] = list[j++];
            }
        }
        
        while(i < mid){
            temp[k++] = list[i++];
        }
        
        while(j < back){
            temp[k++] = list[j++];
        }
        
        for(int x = 0; x < back - front; ++x){
            list[front + x] = temp[x];
        }
    }
}