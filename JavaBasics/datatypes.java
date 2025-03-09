package JavaBasics;

public class datatypes {
    public static void main(String[] args)
    {
        //primitive

        //byte - 1[-128 to 127]
        //short - 2
        //int - 4
        //long - 8
        //float - 4
        //double - 8
        //char - 2 a,b,c,d
        //boolean - 1(true/false)
        byte age = 30;
        int phone = 256357879;
        long phone2 = 25657678698798L;
        float pi = 3.14F;
        char letter = 'a';
        boolean adult = true;


        //non-primitive
        String name =new String("Aman") ;//It is not compulsory to use new keyword
        System.out.println(name.length());
        }
}
