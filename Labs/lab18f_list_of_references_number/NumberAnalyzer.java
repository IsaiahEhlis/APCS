package lab18f_list_of_references_number;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer {

    private ArrayList<Number> list = new ArrayList<>();

    public NumberAnalyzer() {
    }

    public NumberAnalyzer(String numbers) {
        Scanner keyb = new Scanner(numbers);
        while(keyb.hasNextInt()){
            list.add(new Number(keyb.nextInt()));
        }
    }

    public void setList(String numbers) {
        Scanner keyb = new Scanner(numbers);
        while(keyb.hasNextInt()){
            list.add(new Number(keyb.nextInt()));
        }
    }

    public int countOdds() {
        int oddCount = 0;
        for(Number num : list){
            if (num.isOdd()){
                oddCount++;
            }
        }
        return oddCount;
    }

    public int countEvens() {
        int evenCount = 0;
        for(Number num : list){
            if (!(num.isOdd())){
                evenCount++;
            }
        }
        return evenCount;
    }

    public int countPerfects() {
        int perfectCount = 0;
        for(Number num : list){
            if (num.isPerfect()){
                perfectCount++;
            }
        }
        return perfectCount;
    }

    public String toString() {
        return "" + list;
    }
}