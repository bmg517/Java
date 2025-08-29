import java.util.*;
public class Java04_Input_In_Java {

    public static void main(String[]args){
        System.out.println("Taking Input Data From User");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int number = input.nextInt();

        System.out.println("Enter Number 2");
        int number2 = input.nextInt();
        
        System.out.println("Sum Of Two Number Is :");
        int sum = number + number2;
        System.out.println(sum);
    }
}