package lab22e_codes_ciphers;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CipherRunner {

    public static void main(String args[]) {
        Cipher cs = new Caesar();
        System.out.println("chicken");
        System.out.println(cs.encode("chicken"));
        System.out.println(cs.decode(cs.encode("chicken")));

        System.out.println("\nabc");
        System.out.println(cs.encode("abc"));
        System.out.println(cs.decode(cs.encode("abc")));

        System.out.println("\ndnadoublehelix");
        System.out.println(cs.encode("dnadoublehelix"));
        System.out.println(cs.decode(cs.encode("dnadoublehelix")));

        System.out.println("\ncipherscodesandstrings");
        System.out.println(cs.encode("cipherscodesandstrings"));
        System.out.println(cs.decode(cs.encode("cipherscodesandstrings")));

        System.out.println("\nelvissoundgardenhinderseetherbeatles");
        System.out.println(cs.encode("elvissoundgardenhinderseetherbeatles"));
        System.out.println(cs.decode(cs.encode("elvissoundgardenhinderseetherbeatles")));
    }
}