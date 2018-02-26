// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package lab21_BlackJack_TEXT;

public abstract class Card {

    public static final String FACES[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    private String suit;
    private int face;

    //constructors
    // modifiers
    //accessors
    public abstract int getValue();

    public boolean equals(Object obj) {



        return false;
    }
    //toString
}