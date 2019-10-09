// 10/9 Charly This is a program that can display a name in certain way.
public class Names {
    public static void main(String[] args){
        String first= "Misaka";
        String last= "Mikoto";
        System.out.println("Enter first name ==>"+first);
        System.out.println("Enter last name ==>"+last);
        System.out.println(first+" "+ last);
        System.out.println(first.length()+last.length());
        System.out.println(first.substring(0,1)+last.substring(0,1));
        System.out.println(first.compareTo(last));
        System.out.println(last.indexOf(first.substring(5,6)));
        System.out.println(first.indexOf(last.substring(5,6)));
        System.out.print(first.substring(0,3)+last.substring(3)+" ");
        System.out.print(last.substring(0,3)+first.substring(3));


    }
}
