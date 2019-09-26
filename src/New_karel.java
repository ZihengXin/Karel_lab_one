import becker.robots.*;


// 9/26 Charly creating new set of robot
public class New_karel {
    public static void main(String[] args){

        City SandySpring= new City();
        Robot Karel= new Robot(SandySpring, 0,0,Direction.SOUTH, 1);
        Robot Carl= new Robot(SandySpring, 0,3,Direction.EAST, 0);
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.putThing();
        Carl.pickThing();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.move();
        Carl.move();
        Carl.putThing();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.move();
        Carl.move();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
    }
}
