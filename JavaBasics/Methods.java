package JavaBasics;

public class Methods {

    public static void printJava()
    {
        System.out.println("Hello java");
    }

    public static void printName(String name)
    {
        System.out.println(name);
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        //METHODS
        printJava();
        printJava();

        printName("Sara");

        int ans = sum(5, 6);
        System.out.println(ans);

    }
}
