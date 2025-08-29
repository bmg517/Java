import java.util.Scanner;
public class Java10_Strings {

    public static void main(String[]args){
        System.out.println("Welcome To Strings");
        // String Can Also Writtern As Scanner Class
        // String name = new String("Bharat Mohan Gupta");
        // System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");

        // String name = sc.next();   // Print Upto First Space Lline
        String name = sc.nextLine();
        System.out.println(name);

    }
}