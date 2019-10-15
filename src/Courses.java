//10.15 Charly. This program should be able to separate the course department, course number, and title.
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the description of the course? ");
        String courseName=input.nextLine();
        int firstSpace= courseName.indexOf(" ");
        System.out.println("Department: "+courseName.substring(0,firstSpace));
        int secondSpace= courseName.indexOf(" ",firstSpace+1);
        System.out.println("Course Number:"+courseName.substring(firstSpace,secondSpace+1));
        System.out.println("Title: "+courseName.substring(secondSpace+1));
    }
}
