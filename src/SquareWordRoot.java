/* 10/15 Charly. This program should be able to detect the length of a input word.
Then it will calculate the square root of the length, and find its neatest integer.
Finally, it will print out the sentence saying about the 'square root letter" pf the word. */
import java.util.Scanner;

public class SquareWordRoot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word=input.nextLine();
        double sqrtOfWord= Math.sqrt(word.length());
// This line calculates the square root of the length of the input word.
        int nearestInt= (int)(Math.round(sqrtOfWord));
// This line calculates the nearest Integer value of the square root of the length of the word.
        System.out.print("The \"square root\" of "+word+" is "+word.substring(nearestInt,nearestInt+1));

    }
}
