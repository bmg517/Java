public class Java18_Arrays {

    public static void main(String[] args) {
        // int marks [] = new int[5];     // Declaration And Memory Allocation
        // marks[0] =100;                 
        // marks[1] =90;
        // marks[2] =80;
        // marks[3] =70;
        // marks[4] =60;
        // System.out.println(marks[0]);

        
        // int [] number = {10,20,30,40,50};    // Declaration Memory Allocation And Initialition
        // System.out.println(number[0] );
        // System.out.println(number[1] );
        // System.out.println(number[2] );
        // System.out.println(number[3] );
        // System.out.println(number[4] );
        // System.out.println(number.length);
        

        int marks [] = {90,80,70,60,50};
        // float mark [] = {10.2f,30.2f,45.5f,67.4f};
        // String fruit [] = {"Apple", "Mango", "Banana", "Cherry"};
        // System.out.println(fruit[1]);

        // Using Loop For Displaying The Arrys
        // for (int i = 0; i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // For Reverse Order
        // for(int i =marks.length-1; i>=0; i--){
        //     System.out.println(marks[i]);
        // }
        

        // By Using For Each Loop 
        for(int element: marks){
            System.out.println(element);
        }
    }  
}