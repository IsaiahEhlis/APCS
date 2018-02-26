package lab18h_list_of_references_toys;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore {

    private ArrayList<Toy> toyList = new ArrayList<>();

    public ToyStore(String toys) {
        Scanner keyboard = new Scanner(toys);  
        while(keyboard.hasNext()){
            String str = keyboard.next();
            toyList.add(new Toy(str));
        }
    }

    public void loadToys(String toys) {
        Scanner keyboard = new Scanner(toys);
        while(keyboard.hasNext()){
            toyList.add(new Toy(keyboard.next()));
        }
    }

    public Toy getThatToy(String nm) {
        for(Toy item : toyList){
            if (item.getName() == nm){
                return item;
            }
        }
        return null;
    }
    
    public int countToy(String toy){
        int cnt = 0;
        for(Toy item : toyList){
            if (item.getName().equals(toy)){
                cnt++;
            }
        }
        return cnt;
    }
    /*public String getMostFrequentToy() {
        return "";
    }

    public void sortToysByCount() {
    }
*/
    public String toString() {
        return "" + toyList;
    }
}