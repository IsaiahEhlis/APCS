package lab23c_recursion_at_counter;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter {

    private String[][] atMat;

    public AtCounter() {
        atMat = new String[10][10];
        for(int r = 0; r < atMat.length; r++){
            for(int c = 0; c < atMat[r].length; c++){
                if((int)(Math.random() * 10) <= 5){
                    atMat[r][c] = "@";
                }else{
                    atMat[r][c] = "-";
                }
            }
        }
        //size the matrix
        //use nested loops to randomly load the matrix
        //you will need to use Math.random()
    }

    int count = 0;
    public int countAts(int r, int c) {
        if(r >= 0 && c >= 0 && r < atMat.length && c < atMat[r].length){
            if(atMat[r][c].equals("@")){
                atMat[r][c] = "&";
                count++;
                countAts(r+1, c);
                countAts(r-1, c);
                countAts(r, c+1);
                countAts(r, c-1);
            }
        }
        //add in recursive code to count up the # of @s connected
        //start checking at spot [r,c]
        return count;
    }

    /*
     *this method will return all values in the matrix
     *this method should return a view of the matrix
     *that looks like a matrix
     */
    public String toString() {
        String output = "";
        for(String[] r : atMat){
            for(String c : r){
                output += c + " ";
            }
            output += "\n";
        }
        return output;
    }
}