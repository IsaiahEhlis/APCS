package lab24a_sortsearch_string;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;

public class StringSearch {
    
    /*
     *method countWords will count the occurrences of word in sent
     *there may many occurrences of word or none at all
     */

    public static int countWords(String sent, String word) {
        int count = 0;
        for(int i = 0; i < sent.length() - word.length() + 1; i++){
            if(sent.substring(i, i+word.length()).equals(word)){
                count++;
            }
        }
        return count;
    }

    /*
     *method countLetters will count the occurrences of letter in sent
     *there may many occurrences of letter or none at all
     */
    public static int countLetters(String sent, String letter) {
        int count = 0;
        for(int i = 0; i < sent.length(); i++){
            if(sent.substring(i, i+1).equals(letter)){
                count++;
            }
        }
        return count;
    }
}