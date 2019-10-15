//10/15 Charly. This program should be able to tell the change of temperature. The result should never be negative. 
import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the first temperature: ");
        int firstTem= input.nextInt();
        System.out.print("Enter the second temperature: ");
        int secondTem= input.nextInt();
        int result= Math.abs(firstTem-secondTem);
        System.out.print("The temperature changed "+result+" degrees.");
    }
}
