package JavaBasics;

public class Casting {
    public static void main(String[] args) {
        //casting
        double price = 100;
        double finalPrice = price + 18; // Implicit Casting
        System.out.println(finalPrice);

         int p = 100;
        //int fp = p + 18.0;  -->Error

        int fp = p + (int)18.18; // Explicit casting
        System.out.println(fp);


        //constants
        // int age = 30;
        // age = 31;    -->Changes every year

        final float PI = 3.14F;//In java we generally use uppercase letters to declare constants 
        //PI =56.5  -->Error 
        System.out.println(PI);

    }
}
