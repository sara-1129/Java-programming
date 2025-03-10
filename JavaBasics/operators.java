package JavaBasics;

public class operators {
    public static void main (String args[]){

        //operators

        //arithmetic operators
        double a = 1;
        double b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        //assignment operators
             //unary operators
             int i = 1;
             System.out.println(i++); //first uses then increments
             System.out.println(i);

             System.out.println(++i);//first increments then uses


             //similarly decrement operators i-- , --i;

        
        //Comparision Operators  -->Return boolean values
         
            // a == b  
            //a != b
            //a < b
            //a >= b



        //logical operators
            // &&
            // ||
            // !
            boolean c = true;
            boolean d =false;
            System.out.println( c && d);
            System.out.println( c || d);
            System.out.println(  !d);


        



    }
}
