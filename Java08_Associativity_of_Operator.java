public class Java08_Associativity_of_Operator {

    public static void main(String[]args){
        System.out.println("Associativity Of Operators");
        int a = 100/20+30*7;
        int b = 30*2-90/8;
        // Same Precedence So Associativity Is Left from Right;
        System.out.println(a);
        System.out.println(b);
    }
}