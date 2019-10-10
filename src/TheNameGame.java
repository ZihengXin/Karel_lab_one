// 10/10 Charly. Name game. Now it is working better. The main method is not redundant anymore.
import java.util.Scanner;
public class TheNameGame {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("What is your first name?");
        String firstName=new String(input.next());
        System.out.print("What is your last name?");
        String lastName=new String(input.next());
        Fifty(firstName);
        System.out.println(" ");
        Cent(lastName);
    }
    private static void Fifty(String firstName){
        System.out.println(firstName+" "+firstName+", bo-B"+firstName.substring(1));
        System.out.println("Banana-fana fo-"+firstName);
        System.out.println("Fee-fi-mo-M"+firstName.substring(1));
        System.out.println(firstName.toUpperCase()+"!");
    }
    private static void Cent(String lastName){
        System.out.println(lastName+" "+ lastName+", bo-B"+lastName.substring(1));
        System.out.println("Banana-fana fo-F"+ lastName.substring(1));
        System.out.println("Fee-fi-mo-M"+lastName.substring(1));
        System.out.print(lastName.toUpperCase()+"!");
    }
}
