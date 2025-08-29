import java.util.Scanner;
public class Java11_RelationalOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = input.nextInt();
        if (age>50){
            System.out.println("You Are Pro Driver");

        }if(age>30){
            System.out.println("You Are Mid Driver");
        }if (age<18){
            System.out.println("You Need A Driver License");
        }
       
}
}