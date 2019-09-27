// 9/27 Charly. This program is for user to enter the coordinates of the top left corner of a rectangle
import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {
    public static void main(String[] args){
        System.out.print("Enter the x coordinate: ");
        Scanner input=new Scanner(System.in);
        int x_value= input.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y_value= input.nextInt();
        System.out.print("Enter the length: ");
        int length= input.nextInt();
        System.out.print("Enter the width: ");
        int width= input.nextInt();
        Point point= new Point(x_value,y_value);
        Dimension thing= new Dimension(length,width);
        Rectangle r= new Rectangle(point, thing);
        System.out.println(point);
        System.out.println(thing);
        System.out.println(r);
    }
}
