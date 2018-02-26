package lab18h_list_of_references_toys;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner {

    public static void main(String args[]) {
        ToyStore test = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball");
        System.out.println("[sorry " + test.countToy("sorry")+", bat " + test.countToy("bat")+", train "+ test.countToy("train")+", teddy " + test.countToy("teddy") + ", ball " + test.countToy("ball")+ "]");
    }
}