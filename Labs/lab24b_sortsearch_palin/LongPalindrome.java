package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class LongPalindrome {
    /*
     *method getAllPalins will return an array list that contains
     *all of the palindromes contained within word
     *palindromes must have a minimum length of 2
     */
    
    

    public static ArrayList<Palin> getAllPalins(String word) {
        ArrayList<Palin> list = new ArrayList<Palin>();
        for(int i = 0; i < word.length(); i++){
            for(int j = 2; j < word.length(); j++){
                if(i+j < word.length()){
                    Palin one = new Palin(word.substring(i, i+j));
                    if(one.isPalin()){
                        list.add(insertLocation(list, one), one);
                    }
                }
            }
        }
        return list;
    }

    /*
     *method insertLocation will look at the list and determine where to
     *put the new Palin so that the sorted order is maintained
     */
    private static int insertLocation(ArrayList<Palin> list, Palin pal) {
        for(int i = 0; i < list.size(); i++){
            if(pal.getWord().compareTo(list.get(i).getWord()) < 0){
                return i;
            }
        }
        return 0;
    }

    /*
     *method getLongestPalin will return the longest
     *palindrome contained within word
     *a palindrome must a minimum length of 2
     */
    public static Palin getLongestPalin(String word) {
        Palin longest = new Palin("");
        for(int i = 0; i < word.length(); i++){
            for(int j = 2; j < word.length(); j++){
                if(i+j < word.length()){
                    Palin one = new Palin(word.substring(i, i+j));
                    if(one.isPalin() && one.getLength() > longest.getLength()){
                        longest = one;
                    }
                }
            }
        }
        return longest;
    }
}