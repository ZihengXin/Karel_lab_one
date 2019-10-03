/* Charly. This program should create a rectangle, and then double its parameter. Finally move it back to the original
 left corner(100,100). */
import java.awt.*;

public class GrowSquarePrinter {
    public static void main(String[] args){
        Rectangle square=new Rectangle(100,100,50,50);
        System.out.println(square);
        square.grow(25,25);
        square.translate(25,25);
        System.out.println(square);

    }
}
