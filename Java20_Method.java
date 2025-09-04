public class Java20_Method {
     static int logic(int x , int y){
        int z;
        if(x>y){
            z= (x+y)*4;

        }else{
            z = (x+y);
        }
        return z;
    }
    public static void main(String[] args) {
        int a =1;
        int b = 2;
        int c;
        c = logic(a,b);
        // if(a>b){
        //     c = (a+b)*2;
        // }else{
        //     c = (a+b);
        // }
        System.out.println(c);
    }
}
