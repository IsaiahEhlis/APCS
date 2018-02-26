package lab18b_advOOP_Rational_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {

    private int numerator;
    private int denominator;
    
    public Rational(){
        numerator = 1;
        denominator = 1;
    }
    
    public Rational(int num1, int num2){
        numerator= num1;
        denominator = num2;
    }
    
    
    public void setRational(int num1, int num2){
        numerator= num1;
        denominator = num2;
    }
        
    public void setNumerator(int num){
        numerator = num;
    }
    
    public void setDenominator(int den){
        denominator = den;
    }

    public void add(Rational other) {
        //num1/den1 + num2/den2 
        //new numerator = (num1 * den2 + num2 * den1)
        //new denominator = (den1 * den2)
        numerator = ((numerator * other.getDenom()) + (other.getNum() + denominator));
        denominator = denominator * other.getDenom();
        reduce();
    }

    private void reduce() {
        numerator = numerator / gcd(numerator, denominator);
        denominator = denominator / gcd(numerator, denominator);
    }

    private int gcd(int numOne, int numTwo) {
        int gcd = 1;
        for(int i = 2; i <= numOne && i <= numTwo; i++){
            if (numOne % i == 0 && numTwo % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public Object clone() {
        return this;
    }

    public int getNum(){
        return numerator;
    }
    
    public int getDenom(){
        return denominator;
    }
    
    public boolean equals(Rational other) {
        if(((double)numerator / (double)denominator) == ((double)other.getNum() / (double)other.getDenom())){
            return true;
        }
        return false;
    }

    public int compareTo(Rational other) {
        if(((double)numerator / (double)denominator) > (double)other.getNum() / (double)other.getDenom()){
            return 1;
        }
        return -1;
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
}

