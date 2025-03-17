package JavaBasics;

public class Loops {
    public static void main(String[] args) {
        // for loop
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop: " + i);
        }

        // while loop

        int j = 1;
        while (j <= 5) {
            System.out.println("while loop: " + j);
            j++;
        }

        // do-while loop

        int k = 1;
        do {
            System.out.println("do-while loop: " + k);
            k++;
        } while (k <= 5);
    }
}
