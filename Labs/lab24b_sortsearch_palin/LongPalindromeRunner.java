package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class LongPalindromeRunner {

    public static void main(String args[]) {
        String test1 = "bobcat";
        String test2 = "bobracecarcat";
        String test3 = "alligatorslikegroovycatslikemadamandrooroo";
        String test4 = "idrovetothelibraryinmyracecartolearnaboutpanama";
        
        System.out.println(LongPalindrome.getAllPalins(test1).toString());
        System.out.println(LongPalindrome.getLongestPalin(test1));
        System.out.println("");
        
        System.out.println(LongPalindrome.getAllPalins(test2).toString());
        System.out.println(LongPalindrome.getLongestPalin(test2));
        System.out.println("");
        
        System.out.println(LongPalindrome.getAllPalins(test3).toString());
        System.out.println(LongPalindrome.getLongestPalin(test3));
        System.out.println("");
        
        System.out.println(LongPalindrome.getAllPalins(test4).toString());
        System.out.println(LongPalindrome.getLongestPalin(test4));
        System.out.println("");
    }
}