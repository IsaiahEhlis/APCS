package lab18a_advOOP_Monster_lab1_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster {

    private String name;
    private int howBig;

    public Monster() {
        name = "";
        howBig = 0;
    }

    public Monster(String n, int size) {
        name = n;
        howBig = size;
    }

    public String getName() {
        return name;
    }

    public int getHowBig() {
        return howBig;
    }

    public boolean isBigger(Monster other) {
        if (other.getHowBig() < howBig){
            return true;
        }
        return false;
    }

    public boolean isSmaller(Monster other) {
        if (!(isBigger(other))){
            return true;
        }
        return false;
    }

    public boolean namesTheSame(Monster other) {
        if(other.getName().equals(name)){
            return true;
        }
        return false;
    }

    public String toString() {
        return name + " " + howBig;
    }
}