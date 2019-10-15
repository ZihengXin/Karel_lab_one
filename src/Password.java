/* 10/10 Charly. This is a password generator that can generate a password based on one's first name, middle
name, last name, and age.  */
import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("First Name: ");
        String first= input.nextLine();
        System.out.println("Middle Name: ");
        String middle= input.nextLine();
        System.out.println("Last Name: ");
        String last= input.nextLine();
        System.out.print("Ages: ");
        int age= input.nextInt();
        System.out.println(" ");
        System.out.print("Password: ");
        capMid(first);
        capMid(middle);
        capMid(last);
        last(first);
        last(middle);
        last(last);
        age(age);
    }
// this line is to calculate the middle letter of the name
    private static void capMid(String name){
        int mid= name.length()/2;
        System.out.print(name.toUpperCase().substring(mid,(mid+1)));
    }
//CapMid is the program that will print out the capitalize letter of the middle of a name
    private static void last(String name){
        int last= name.length();
        System.out.print(name.toLowerCase().substring(last-1));
    }
    private static void age(int age){
        System.out.print(age*75);
    }
}
