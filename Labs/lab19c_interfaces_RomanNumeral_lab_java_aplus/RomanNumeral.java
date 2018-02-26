package lab19c_interfaces_RomanNumeral_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral> {

    private Integer number;
    private String roman;
    private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1};
    private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumeral(String str) {
        roman = str;
    }

    public RomanNumeral(Integer orig) {
        number = orig;
    }

    public void setNumber(Integer num){
        number = num;
    }
    
    public void setRoman(String str){
        roman = str;
    }
    
    public Integer getNumber(){
        int ret = 0;
        String temp = roman;
        for (int i = 0; i < LETTERS.length; i++) {
            while (temp.length() > 0&& temp.substring(0, LETTERS[i].length()).equals(LETTERS[i])){
                ret += NUMBERS[i];
                temp = temp.substring(LETTERS[i].length());
            }    
        }
        return ret;
    }
    
    public String getRoman(){
        return roman;
    }
    
    public int compareTo(RomanNumeral r) {
        return this.getNumber() - r.getNumber();
    }
    
    public String toString(){
        String output = "";
        int temp = number;
            for(int i = 0; i < NUMBERS.length; i++){
                while(temp >= NUMBERS[i]){
                    if(temp - NUMBERS[i] >= 0){
                        output += LETTERS[i];
                        temp -= NUMBERS[i]; 
                    }
                }
            }    
        return output;
    }
}