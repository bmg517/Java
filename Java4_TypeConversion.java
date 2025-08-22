public class Java4_TypeConversion {

    public static void main(String[] args) {
        int value = (int) 344.4d;
        // Data will Loss While Converting From Double To Integer
        System.out.println(value);

        double money = (double)33.0f;
        System.out.println(money);
    }
}