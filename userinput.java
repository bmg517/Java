import java.util.Scanner;
public class userinput {
  public static void main(String[] args) {
    System.out.println("User Input In Java");
    System.out.println("  ");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The First Name");
    String fname = input.next();
    System.out.println("Enter The Last Name");
    String lname = input.next();
    System.out.print("The Full Name Is: ");
    String name = fname + " " + lname;
    System.out.println(name);



    
  }
}
