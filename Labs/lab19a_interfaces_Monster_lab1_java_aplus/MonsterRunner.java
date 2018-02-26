package lab19a_interfaces_Monster_lab1_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Enter first monster's name: ");
            String nm1 = keyboard.next();
            System.out.print("Enter first monster's size: ");
            int sz1 = keyboard.nextInt();

            Monster test1 = new Monster(nm1, sz1);

            System.out.println("");
            System.out.print("Enter second monster's name: ");
            String nm2 = keyboard.next();
            System.out.print("Enter second monster's size: ");
            int sz2 = keyboard.nextInt();

            Monster test2 = new Monster(nm2, sz2);

            System.out.println("");

            System.out.println("Monster 1 - " + test1.toString());
            System.out.println("Monster 2 - " + test2.toString());
            
            System.out.println("");
            
            if(test1.isBigger(test2)){
                System.out.println("Monster one is bigger than monster two.");
            }else{
                System.out.println("Monster one is smaller than monster two.");
            }
            
            if(test1.namesTheSame(test2)){
                System.out.println("Monster one has the same name as monster two.");
            }else{
                System.out.println("Monster one does not have the same name as monster two.");
            }
            System.out.println("\n");
        }

    }
}