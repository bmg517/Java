import java.util.Scanner;
public class Java14_Switch {

    public static void main(String[] args) {
        System.out.println("Enter Your Age :");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();


        // switch(age){
        //     case 23:
        //             System.out.println("You Need A Job ");
        //             break;
        //     case 40:
        //             System.out.println("You Need Some Rest");
        //             break;
        //     case 70:
        //             System.out.println("You Need Retirement");
        //             break;
        //         }
        //         System.out.println("Thanks For Using");



             // Enhance Switch Statement
             
        switch(age){
            case 23:System.out.println("You Need A Job ");
                    break;
            case 40:System.out.println("You Need Some Rest");
                    break;
            case 70:System.out.println("You Need Retirement");
                    break;
                }     
    }
}