// 10/9 Charly. Name game. Now it is working but still redundant. I will keep working on it next day.
import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("What is your first name?");
        String firstName=new String(input.next());
        System.out.print("What is your last name?");
        String lastName=new String(input.next());
        System.out.println(firstName+" "+firstName+", bo-B"+firstName.substring(1));
        System.out.println("Banana-fana fo-"+firstName);
        System.out.println("Fee-fi-mo-M"+lastName.substring(1));
        System.out.println(firstName.toUpperCase()+"!");
        System.out.println(" ");
        System.out.println(lastName+" "+ lastName+", no-B"+lastName.substring(1));
        System.out.println("Banana-fana fo-F"+ lastName.substring(1));
        System.out.println("Fee-fi-mo-M"+lastName.substring(1));
        System.out.print(lastName.toUpperCase()+"!");
    }
}
