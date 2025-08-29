import java.util.Scanner;
public class Java05_Userinput {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name");
        // String name = sc.nextLine();
        // System.out.println("Welcome "+ name + " To Coding");


        // Create A Program To Add Two Numbers  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number");
        int num2 = sc.nextInt();
        System.out.println("Sum Of Two Number Is: ");
        int sum = num1 + num2;
        System.out.println(sum);



    }
}