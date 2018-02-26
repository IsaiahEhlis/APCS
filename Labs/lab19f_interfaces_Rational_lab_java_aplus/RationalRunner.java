package lab19f_interfaces_Rational_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RationalRunner {

    public static void main(String args[]) {
        Rational test = new Rational();
        out.println("test = " + test);

        Rational newOne = new Rational(3, 4);
        out.println("newOne = " + newOne);

        out.println("test.equals(newOne) = " + test.equals(newOne));

        newOne = (Rational) test.clone();
        out.println("\n\nnewOne after test.clone() = " + newOne);
        out.println("test.equals(newOne) = " + test.equals(newOne));

        Rational rOne = new Rational(1, 2);
        Rational rTwo = new Rational(2, 3);
        out.println("1/2.equals(2/3) = " + rOne.equals(rTwo));
        test.setRational(4, 6);
        out.println("2/3.equals(4/6) = " + rTwo.equals(test));

        out.println("\n\nrOne = " + rOne);
        out.println("rTwo = " + rTwo);

        out.println("rOne.compareTo(rTwo) = " + rOne.compareTo(rTwo));
        out.println("rTwo.compareTo(rOne) = " + rTwo.compareTo(rOne));

        rOne.add(rTwo);
        out.println("\n\nrOne.add(rTwo) = " + rOne);

        rOne.setRational(1, 2);
        rTwo.setRational(1, 3);
        rOne.add(rTwo);
        out.println("\n\n1/2.add(1/3) = " + rOne);

        rOne.setRational(4, 10);
        rTwo.setRational(3, 5);
        rOne.add(rTwo);
        out.println("\n\n4/10.add(3/5) = " + rOne);

        rOne.setRational(2, 10);
        rTwo.setRational(3, 6);
        rOne.add(rTwo);
        out.println("\n\n2/10.add(3/6) = " + rOne);

        //1/4 + 2/8 = 1/2
        rOne.setRational(1, 4);
        rTwo.setRational(2, 8);
        out.println("\n\n1/4.equals(2/8) = " + rOne.equals(rTwo));
        rOne.add(rTwo);
        out.println("\n\n1/4.add(2/8) = " + rOne);

        //1/6 + 2/8 = 5/12
        rOne.setRational(1, 6);
        rTwo.setRational(2, 8);
        out.println("\n\n1/6.equals(2/8) = " + rOne.equals(rTwo));
        rOne.add(rTwo);
        out.println("\n\n1/6.add(2/8) = " + rOne);
    }
}