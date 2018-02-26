package lab22e_codes_ciphers;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class Caesar implements Cipher {

    private final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String shiftSt;
    private int howFar;

    public Caesar() {
        howFar = (int) (Math.random() * 26);
        shiftSt = alpha.substring(howFar) + alpha.substring(0, howFar);
    }

    public Caesar(int far) {
        howFar = far;
        shiftSt = alpha.substring(howFar) + alpha.substring(0, howFar);
    }

    public String encode(String toEncode) {
        return "";
    }

    public String decode(String toDecode) {
        return "";
    }
}