package lab24c_sortsearch_insertion;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort {

    private ArrayList<String> list;
    
    public InsertionSort() {
        list = new ArrayList<String>();
    }

    //modfiers
    public void add(String word) {
        int loc = Collections.binarySearch(list, word);
        if(loc < 0){
            list.add(findInsertLocation(word), word);
            System.out.println("adding " + word);
        }
    }

    private int findInsertLocation(String word) {
        for(int i = 0; i < list.size(); i++){
            if(word.compareTo(list.get(i)) <= 0){
                return i;
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        return list.size() - 1;
    }

    public void remove(String word) {
        System.out.println("removing " + word);
        list.remove(word);
    }

    public String toString() {
        return "printing the list : : " + list.toString();
    }
}