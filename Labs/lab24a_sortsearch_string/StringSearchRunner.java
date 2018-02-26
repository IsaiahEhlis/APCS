package lab24a_sortsearch_string;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class StringSearchRunner {

    public static void main(String args[]) {
        System.out.println(StringSearch.countLetters("computerscience", "t"));
        System.out.println(StringSearch.countWords("computerscience", "to"));
        System.out.println("");
        StringSearch test1 = new StringSearch();
        System.out.println(StringSearch.countLetters("onetwoonetwofun", "n"));
        System.out.println(StringSearch.countWords("onetwoonetwofun", "one"));
        System.out.println("");
        StringSearch test2 = new StringSearch();
        System.out.println(StringSearch.countLetters("odogdogdogdogo", "o"));
        System.out.println(StringSearch.countWords("niininininininininini", "ni"));
    }
}