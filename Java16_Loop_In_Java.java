public class Java16_Loop_In_Java {
    public static void main(String[] args) {
        // Three Type Of Loops.
        // 1. While Loop
        // 2. Do-While Loop
        // 3. For Loop

        /*  1. While Loop

        int i = 100;
        while(i<200){
            System.out.println(i);
            ++i;
        }

        For Example :-- First Show The Ticket Then Enter Into It.

        Infinite Loop

        while(true){
            System.out.println("Hello Loop");
        }
        */

        // 2. Do-While Loop  First Enter Into The Statement Then Check The Condition

        // int a = 10;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a<=5);

        // For Example :-- First Enter Into Without Ticket Then We Check 
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;

        // }while (i<20);


        // 3. For Loop 

        // int i =0;
        // for(int n =10; n>i; n--){
        //     System.out.println(2*n+1);
        // }
       for(int i =5; i!=0; i--){
        System.out.println(i);
       }
    }
}