package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals) {
        grid = new String[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                grid[i][j] = vals[(int)(Math.random() * vals.length)] + " ";
            }
        }
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals) {
        String output = vals[0];
        for(String s : vals){
            if(countVals(s) > countVals(output)){
                output = s;
            }
        }
        return output;
    }

    //returns a count of how many times val occurs in the matrix
    public int countVals(String val) {
        int count = 0;
        for(String[] row : grid){
            for(String col : row){
                if(col.trim().equals(val)){
                    count++;
                }
            }
        }
        return count;
    }

    //display the grid
    public String toString() {
        String output = "";
        for(String[] row : grid){
            for(String col : row){
                output += col;
            }
            output += "\n";
        }
        return output;
    }
}