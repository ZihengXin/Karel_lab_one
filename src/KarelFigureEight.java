// 9/26 Charly. 8_route robot moving.
import becker.robots.*;

public class KarelFigureEight {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,5, 3, Direction.NORTH, 0);

        Thing thing1 = new Thing(ssfs, 2, 3);
        Thing thing2 = new Thing(ssfs, 4, 3);

        /* Before I started to write the code, I was confused by the definition of "8-pattern"
        Even though the B-shape takes fewer steps to accomplish, I am not sure if the B-route follows the instruction.
        So I chose to write the code for a classical 8-route. It looks longer than the other routes, but at least
        it goes like how people write the number 8*/

        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();

    }
}
