import java.util.Scanner;
public class Java13_Conditional_In_Java {
     public static void main(String[] args) {
                             // 1. If-Else Statement

        // int age = 8;
        // if(age==18){
        //     System.out.println("You Can Drive");
        // }else{
        //     System.out.println("You Cannot Drive");
        // }
    

                              // Logical Operators In Java

    // boolean a = true;
    // boolean b = false;

    // System.out.println("For Logical AND");
    // if(a && b ){
    //     System.out.println("Yes");
    // }else{
    //     System.out.println("No");
    // }

    // System.out.println("For Logical NOT");  

    // if(a || b){
    //     System.out.println("Yes");
    // }else{
    //     System.out.println("No");
    // }

    // System.out.println("For Logical NOT");  // Reverse 

    // System.out.println("NOT(a) is");
    // System.out.println(!a);
    // System.out.println("NOT(b) is");
    // System.out.println(!b);
    

    //                       2. If-Else If-Else Ladder
    
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Driving License Kindly Enter You Age");
    int age = input.nextInt();
    if(age>56){
        System.out.println("You Are Experience");
    }
    else if(age>46){
        System.out.println("You Are Semi-Experiance ");
    }
    else if(age>36){
        System.out.println("You Are Mid-Level Experience");
    }
    else if (age>18){
        System.out.println("You Are Low-Level Experience");
    }
    else{
        System.out.println("You Need A Driving License ");
    }
}
}