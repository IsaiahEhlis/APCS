package lab19b_interfaces_Monster_lab2_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable {

    private int myWeight;
    private int myHeight;
    private int myAge;
    
    public Monster(){
        myAge = 0;
        myWeight = 0;
        myHeight = 0;
    }
    
    public Monster(int ht){
        myHeight = ht;
    }
    
    public Monster(int ht, int wt){
        myHeight = ht;
        myWeight = wt;
    }
    
    public Monster(int ht, int wt, int age){
        myHeight = ht;
        myWeight = wt;
        myAge = age;
    }
    
    public void setHeight(int ht){
        myHeight = ht;
    }
    
    public void setWeight(int wt){
        myWeight = wt;
    }
    
    public void setAge(int age){
        myAge = age;
    }
    
    public int getHeight(){
        return myHeight;
    }
    
    public int getWeight(){
        return myWeight;
    }
    
    public int getAge(){
        return myAge;
    }

    //creates a new copy of this Object
    
    public Object clone() {
        return this;
    }

    public boolean equals(Monster mon) {
        if(myHeight == mon.getHeight() && myWeight == mon.getWeight() && myAge == mon.getAge()){
            return true;
        }
        return false;
    }

    public int compareTo(Object obj) {
        Monster rhs = (Monster) obj;
        if(rhs.getHeight() != myHeight){
            if(rhs.getHeight() < myHeight){
                return 1;
            }
            return -1;
        }else{
            if(rhs.getWeight() != myWeight){
                if(rhs.getWeight() < myWeight){
                    return 1;
                }
                return -1;
            }else{
                if(rhs.getAge() < myAge){
                    return 1;
                }
                return -1;
            }
        }
   
    }
    
    public String toString(){
        return myHeight + " " + myWeight + " " + myAge;
    }
    //write a toString() method
}