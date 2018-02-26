package lab18g_list_of_references_word;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words {

    private ArrayList<Word> words = new ArrayList<>();

    public Words() {
        setWords("");
    }

    public Words(String wordList) {
        setWords(wordList);
    }

    public void setWords(String wordList) {
        Scanner keyb = new Scanner(wordList);
        while(keyb.hasNext()){
            words.add(new Word(keyb.next()));
        }
    }

    public int countWordsWithXChars(int size) {
        int count = 0;
        for(Word wrd : words){
            if(wrd.getLength() == size){
                count++;
            }
        }
        return count;
    }

    //this method will remove all words with a specified size / length
    //this method will also return the sum of the vowels in all words removed
    public int removeWordsWithXChars(int size) {
        int count = 0;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).getLength() == size){
                count += words.get(i).getNumVowels();
                words.remove(i);
            }
        }
        return count;
    }

    public int countWordsWithXVowels(int numVowels) {
        int count = 0;
        for(Word wrd : words){
            if(wrd.getNumVowels() == numVowels){
                count++;
            }
        }
        return count;
    }

    public String toString(){
        return "" + words;
    }
}
