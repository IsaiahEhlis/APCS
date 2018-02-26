package lab19d_interfaces_SortByLength_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;

public class WordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("words.dat"));

        int size = file.nextInt();
        file.nextLine();
        ArrayList<Word> origWords = new ArrayList<>();
        ArrayList<Word> finalWords = new ArrayList<>();
        
        for(int i = 0; i < size; i++){
            origWords.add(new Word(file.nextLine()));
        }
        
        int tempSize = 10;
        while(finalWords.size() < size){
            Word longest = origWords.get(0);
            for(int j = 0; j < tempSize; j++){
                if(longest.compareTo(origWords.get(j)) < 0){
                    longest = origWords.get(j);
                    j = 0;
                } else if(longest.compareTo(origWords.get(j)) == 0){
                    if(longest.getWord().compareTo(origWords.get(j).getWord()) < 0){
                        longest = origWords.get(j);
                        j = 0;
                    }
                }
            }
            finalWords.add(0, longest);
            origWords.remove(longest);
            tempSize--;
        }
       
        for (int x = 0; x < size; x++) {
            System.out.println(finalWords.get(x)); 
        }
    }
}