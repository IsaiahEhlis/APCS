package lab24e_sortsearch_merge;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class MergeSortRunner {

    public static void main(String args[]) {
        MergeSort.mergeSort(new Comparable[]{9, 5, 3, 2});
        System.out.println("");

        MergeSort.mergeSort(new Comparable[]{19, 52, 3, 2, 7, 21});
        System.out.println("");

        MergeSort.mergeSort(new Comparable[]{68, 66, 11, 2, 42, 31});
    }
}