// 10/15 Charly. This program should be able to calculate and print the distance between two points input by user.
import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point:");
        int xOne=input.nextInt();
        System.out.println("Enter the y coordinate of the first point:");
        int yOne=input.nextInt();
        System.out.println("Enter the x coordinate of the second point:");
        int xTwo=input.nextInt();
        System.out.println("Enter the y coordinate of the second point:");
        int yTwo=input.nextInt();
        double result= Math.sqrt((xOne-xTwo)*(xOne-xTwo)+(yOne-yTwo)*(yOne-yTwo));
        System.out.print("The distance between ("+xOne+","+yOne+") and ("+xTwo+","+yTwo+") is "+result);
    }
}
