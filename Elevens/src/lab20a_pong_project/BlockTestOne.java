package lab20a_pong_project;

import static java.lang.System.*;
import javafx.scene.paint.Color;


class BlockTestOne {

    public static void main(String args[]) {
        Block one = new Block();
        out.println(one);

        Block two = new Block(350, 350, 15, 15, Color.RED);
        out.println(two);

        Block three = new Block(450, 50, 20, 60, Color.GREEN);
        out.println(three);

        out.println(one.equals(two));
        out.println(one.equals(one));
    }
}