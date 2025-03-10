package JavaBasics;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        
    //stores data at contigious memory locations
    
    int[] marks =new int[3];
    marks[0] = 97;
    marks[1] = 98;
    marks[2] = 95;

    System.out.println(marks[0]); 
    //If we declare a variable and do not initialise it ,in java it gets initialised with null value

    //length
    System.out.println(marks.length);
    
    //sort
    Arrays.sort(marks);
    System.out.println(marks[0]); 

    //  If we know which elements we want to store in array then we don't need to use new keyword ,we can directly initialise an array
    int[] marks2 = {97, 98, 95};
    System.out.println(marks2[0]);

    // 2D arrays
    int[][] finalMarks = {{97, 98, 95},{95, 95, 98}};
    System.out.println(finalMarks[0][0]);
    
    }
}
