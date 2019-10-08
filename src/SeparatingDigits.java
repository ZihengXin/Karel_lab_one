// Charly. Oct 08, 2019. This program should be able to separate a four digit number in to 4 numbers and display them
// in order.
import java.util.Scanner;

public class SeparatingDigits {
    private static int quotient(int a){
        a/=10;
        return a;
        // divide the number by 10
    }
    private static int remainder(int a){
        a%=10;
        return a;
        // get the remainder for a
    }
    public static void main(String[] args){
        System.out.print("Enter a 4 digit number: ");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        System.out.print(SeparatingDigits.quotient(SeparatingDigits.quotient(SeparatingDigits.quotient(a)))+" ");
        System.out.print(SeparatingDigits.remainder(SeparatingDigits.quotient(SeparatingDigits.quotient(a)))+" ");
        System.out.print(SeparatingDigits.remainder(SeparatingDigits.quotient(a))+" ");
        System.out.print(SeparatingDigits.remainder(a));

    }
}
