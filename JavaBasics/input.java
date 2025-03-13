package JavaBasics;

import java.util.Scanner;

public class input {
    //How to take input
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Input your age: ");
    // int age = sc.nextInt();  //Scans the next token of the input as an int.
    // System.out.println(age);
    System.out.println("Input your name: ");
    // String name = sc.next(); //Used to take input for string but it doesn't take spaces.
    String name = sc.nextLine(); //We can even take our whole line as input.
    System.out.println(name);


    
   }
}
