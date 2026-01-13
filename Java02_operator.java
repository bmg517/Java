import java.util.Scanner;
public class Java02_operator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The Value Of A: ");
    int a = input.nextInt();
    System.out.println("Enter The Value Of B :");
    int b = input.nextInt();
    int temp = a;
    a=b;
    b = temp;
    System.out.println("After Swapping");
    System.out.println("The Value Of A :" + a);
    System.out.println("The Value Of B ;" + b);
  



  }
}