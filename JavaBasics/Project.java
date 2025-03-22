package JavaBasics;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int randomNo = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Guess the number(1 to 100):");
            num = sc.nextInt();
            if (num == randomNo) {
                System.out.println("Your guess is correct!");
            } else {
                System.out.println("Your guess is wrong.Try again!");
                System.out.println("Enter -1 to stop guessing");
            }
        }
        while(num != -1);
        System.out.println("The number is " + randomNo);
    }
}
