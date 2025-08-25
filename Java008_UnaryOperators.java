public class Java008_UnaryOperators{
    public static void main(String[]args){
        // int x = 5;
        // int y = -x;
        // int z = -y;
        // System.out.println(x);
        // System.out.println(y);

        // 1.Pre Increasement
        int a = 10;
        System.out.println(++a);   // First Increase Then Use
        System.out.println(a);

        // 2.Post Increasement

        System.out.println(a++);  // First Use Then Increase
        System.out.println(a);

        // 3.Pre Decreasement
        int x = 30;
        System.out.println(--x);  // First Decrease Then Use
        System.out.println(x);

        // 4.Post Decreasement
        System.out.println(x--);  // First Use Then Decrease
        System.out.println(x);




        
    }
}