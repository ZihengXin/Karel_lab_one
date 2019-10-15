// 10/15 Charly. This program should be able to calculate and print the value of the power.
import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base= input.nextInt();
        System.out.print("Enter the exponent:");
        int exponent= input.nextInt();
        double result=Math.pow(base,exponent);
        System.out.print(base+"^"+exponent+" = "+result);
    }
}
