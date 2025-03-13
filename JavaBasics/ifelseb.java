package JavaBasics;

import java.util.Scanner;
public class ifelseb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money:");
        int money =sc.nextInt();
        //pen costs 10 rupees
        //notebook costs 40 rupees
        if(money < 10)
        {
            System.out.println("He can't buy anything.");

        }
        else if(money < 40)
        {
            System.out.println("He can buy pen.");
        }
        else if(money < 50)
        {
            System.out.println("He can buy either pen or notebook.");
        }
        else
        {
            System.out.println("He can buy both pen and notebook.");
        }
    }
}
