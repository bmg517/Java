import java.util.Scanner;
public class Java13_Loop {

    public static void main(String[] args) {
        
        // int a =1;                               // Initialization
        // while(a<1000){                          // Condition
        //     System.out.println(a);            
        //     a= a+ 1;                            // Upadation
        // }

        // int num = 1000;
        // while(num>=120){
        //     System.out.println(num);
        //     num = num -1;
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value");
        int num = input.nextInt();
        while(num>100){
            System.out.println(num);
            num = num+1;
        }
    }
}