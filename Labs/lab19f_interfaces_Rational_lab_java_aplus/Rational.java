package lab19f_interfaces_Rational_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
    private int numer;
    private int denom;
    
    public Rational(){
        numer = 1;
        denom = 1;
    }
    
    public Rational(int num, int den){
        numer = num;
        denom = den;
    }
    
    public void setRational(int num, int den){
        numer = num;
        denom = den;
    }
    
    public void setNumerator(int nm){
        numer = nm;
    }
    
    public void setDenominator(int dn){
        denom = dn;
    }
    
    public int getNumer(){
        return numer;
    }
    
    public int getDenom(){
        return denom;
    }
    
    public void add(Rational other) {
        //num1/den1 + num2/den2 
        //new numerator = (num1 * den2 + num2 * den1)
        //new denominator = (den1 * den2)
        numer = ((numer * other.getDenom()) + (other.getNumer() * denom));
        denom = (denom * other.getDenom());
        reduce();
    }

    private void reduce() {
        int tempNum = numer;
        numer /= gcf(numer, denom);
        denom /= gcf(tempNum, denom);
    }

    private int gcf(int numOne, int numTwo) {
        int ret = 1;
        for(int i = 2; i <= numOne && i <= numTwo; i++){
            if(numOne % i == 0 && numTwo % i == 0){
                ret = i;
            }
        }
        return ret;
    }

    public Object clone() {
        return this;
    }

    public boolean equals(Rational other) {
        reduce();
        other.reduce();
        if(numer == other.getNumer() && denom == other.getDenom()){
            return true;
        }
        return false;
    }

    public int compareTo(Rational other) {
        if((double)numer / (double)denom > (double)other.getNumer() / (double)other.getDenom()){
            return 1;
        } else if ((double)numer / (double)denom == (double)other.getNumer() / (double)other.getDenom()){
            return 0;
        }
        return -1;
    }
    public String toString(){
        return numer + "/" + denom;
    }

}