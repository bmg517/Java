import java.util.Scanner;
public class Java08_ShorthandOpertors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10;
        System.out.println("Enter The Value");

        int x1 = input.nextInt();
        // a = a+x1;
        a+=x1;
        System.out.println(a);

        int x2 = input.nextInt();
        // a = a+x2;
        a+=x2;

        System.out.println(a);

        int x3 = input.nextInt();
        // a = a+x3;
        a+=x3;
        System.out.println(a);

        int x4 = input.nextInt();
        // a = a+x4;
        a+=x4;
        System.out.println(a);

        int x5 = input.nextInt();
        // a = a+x5;
        a+=x5;

        System.out.println(a);



    }
}