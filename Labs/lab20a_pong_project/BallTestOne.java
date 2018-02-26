package lab20a_pong_project;



// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import javafx.scene.paint.Color;


class BallTestOne {

    public static void main(String args[]) {
        Ball one = new Ball();
        out.println(one);

        Ball two = new Ball(100, 100, 30, 50, Color.BLUE);
        out.println(two);

        //x, y, wid, ht, color, xSpd, ySpd
        Ball three = new Ball(100, 100, 30, 50, Color.BLUE, 5, 6);
        out.println(three);

        out.println(two.equals(three));

        out.println(three.equals(three));
    }
}