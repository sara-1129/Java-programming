package JavaBasics;

public class Trycatch {
    public static void main(String[] args) {
        //TRY-CATCH EXCEPTION HANDLING
        int[] marks = {97,98,95};
        try{
            System.err.println(marks[5]);  //ArrayIndexOutOfBoundsException
        }catch(Exception exception) {
            //do things after catching
            
        }
        

        System.err.println("Sara");
    }
}
