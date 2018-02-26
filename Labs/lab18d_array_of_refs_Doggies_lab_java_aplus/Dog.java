package lab18d_array_of_refs_Doggies_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Dog {

    private int age;
    private String name;

    public Dog(int a, String n) {
        age = a;
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "" + age + " " + name;
    }
}