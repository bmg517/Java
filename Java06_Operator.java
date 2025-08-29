public class Java06_Operator {

    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 20;
        int b =10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);  // Modaulo Operator 

        // 2. Assingement Operator
        int x = 100;
        int y = +x;
        System.out.println(y);
        System.out.println(x);

        // 3. Comparrison Operator 
        System.out.println(6==7);
        System.out.println(6==6);
        System.out.println(100>=99);
        System.out.println(20<21);

        // 4. Logical Operator

        System.out.println(30>20 && 40<30);
        System.out.println(200<300 || 20>77);


        // 5. Bitwise Operator 
        System.out.println(20 & 10);
        
    }
}