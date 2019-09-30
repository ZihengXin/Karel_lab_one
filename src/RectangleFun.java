// 9.30 Charly. this program should be able to calculate the parameter of a Rectangle.
import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args){
        System.out.print("Width: ");
        Scanner input=new Scanner(System.in);
        int width=input.nextInt();
        System.out.print("Height: ");
        int height=input.nextInt();
        System.out.print("X: ");
        int x=input.nextInt();
        System.out.print("Y: ");
        int y= input.nextInt();
        Rectangle r=new Rectangle(x,y,width,height);
        double parameter= 2*r.getWidth()+2*r.getHeight();
        r.setLocation((int)(r.getX()-4),(int)(r.getY()+2));
        System.out.println("Parameter = "+parameter);
        System.out.print("New location is ("+r.getX()+","+r.getY()+")");


    }
}
