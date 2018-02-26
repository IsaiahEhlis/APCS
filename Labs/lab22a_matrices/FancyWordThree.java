package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordThree {

    private char[][] mat;

    public FancyWordThree(String s) {
        int n = s.length() - 1;
        mat = new char[1 + 4 * n][1 + 4 * n];
        for(int a = 0; a < mat.length; a++){
            for(int b = 0; b < mat[0].length; b++){
                mat[a][b] = ' ';
            }
        }
        if(mat.length > 1){  
            mat[0][(mat.length - 1) / 2] = s.charAt(s.length() - 1);
            mat[mat.length - 1][(mat.length - 1) / 2] = s.charAt(s.length() - 1);
            mat[mat.length / 2][0] = s.charAt(s.length() - 1);
            mat[mat.length / 2][mat.length / 2] = s.charAt(s.length() - 1);
            mat[mat.length / 2][mat.length - 1] = s.charAt(s.length() - 1);
            for(int i = 1; i < s.length(); i++){
                mat[i][mat.length - (2 * s.length() - 1) - i] = s.charAt(s.length() - 1 - i);//left leg
                mat[i][mat.length - (s.length() - i + 1 + (s.length() - 2))] = s.charAt(s.length() - 1 - i);//right leg
            }
            int y = 1;
            for(int j = s.length(); j < mat.length / 2; j++){
                mat[j][mat.length - (s.length() - y)] = s.charAt(y);
                mat[j][mat.length - (3 * s.length() - 2) - y] = s.charAt(y);
                y++;
            }
            int b = 1;
            for(int a = s.length(); a < mat.length / 2; a++){
                mat[a][mat.length - (s.length() * 3 - 2) + b/*stuff*/] = s.charAt(b);
                mat[a][mat.length - (s.length()) - b] = s.charAt(b);
                b++;
            }
            int o = 1;
            for(int m = mat.length / 2; m < mat.length; m++){
                if(o < s.length()){
                    mat[mat.length / 2 + o][o] = s.charAt(s.length()- 1 - o);
                    mat[mat.length / 2 + o][mat.length - 1 - o] = s.charAt(s.length()- 1 - o);
                }
                o++;
            }
            int d = 1;
            for(int c = mat.length / 2 + s.length(); c < mat.length; c++){
                mat[c][s.length() + d - 1] = s.charAt(d);
                mat[c][mat.length - s.length() - d] = s.charAt(d);
                d++;
            }
            int e = 1;
            for(int f = mat.length / 2 + 1; f < mat.length - s.length(); f++){
                mat[f][2 * s.length() - e - 2] = s.charAt(s.length() - 1 - e);
                mat[f][2 * s.length() + e - 2] = s.charAt(s.length() - 1 - e);
                e++;
            }
        }
        else{
            mat[0][0] = s.charAt(0);
        }


    }

    public String toString() {
        String output = "";
        for(char[] row : mat){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println("");
        }
        return output + "\n\n";
    }
}