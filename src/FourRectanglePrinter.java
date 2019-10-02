// Charly. This program should be able tp create a rectangle, and move and print it 4 times.
import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args){
        Rectangle box= new Rectangle(0,0,5,5);
        System.out.println(box);
        box.translate(5,0);
        System.out.println(box);
        box.translate(0,-5);
        System.out.println(box);
        box.translate(-5,0);
        System.out.println(box);


    }
}
