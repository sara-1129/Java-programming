package JavaBasics;

public class Strings {
    public static void main(String[] args) {
        // Strings

        // concatenate
        String name1 = "Sara";
        String name2 = "Saini";
        String name3 = name1 + " " + name2;
        System.out.println(name3);

        // charAt
        System.out.println(name1.charAt(0));

        // length
        System.out.println(name1.length());

        // replace
        String name4 = name2.replace('a', 'b'); // It doesn't affect the original string
        System.out.println(name4);
        System.out.println(name2);

        //substrings
        String name5 ="Aman and Akku";
        System.out.println(name5.substring(0,3)); //Index 3 will not be included
        //Strings are immutable in java

    }

}
