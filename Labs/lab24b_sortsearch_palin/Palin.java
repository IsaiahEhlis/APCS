package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class Palin{
    
    private String word;
    
    public Palin(){
        word = "";
    }
    
    public Palin(String s){
        word = s;
    }
    
    public int getLength(){
        return word.length();
    }
    
    public String getWord(){
        return word;
    }
    
    public boolean isPalin(){
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    
    public String toString(){
        return word;
    }
}


	//toString method - returns a String
