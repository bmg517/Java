public class Java10_if_else {
    public static void main(String[]args){
        boolean isMale = true;
        String name = "Bharat";

        if(isMale){
            System.out.println("Mr. " + name);
        
        }else{
            System.out.println("Mrs. " + name);
        }

        boolean isSeniorCitizen = false;
        boolean isChild = false;

        if (isSeniorCitizen){
            System.out.println("Hello SeniorCitizen");
        }else{
            if (isChild){
                System.out.println("Hello Child");
            }else{
                System.out.println("You Are A Baby");
            }
        }

    }
}
