package lab23b_recursion;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunTwo {

    public static int countChickens(String word) {
        if(word.equals("chicken")){
                return 1;
        }
        for(int i = 0; i < word.length() - 6; i++){
            if(word.substring(i, i + 7).equals("chicken")){
                return 1 + countChickens(word.substring(0, i) + word.substring(i+7));
            }
        }
        return 0;
    }
}