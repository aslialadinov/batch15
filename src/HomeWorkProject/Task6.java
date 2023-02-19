package HomeWorkProject;

public class Task6 {
    public static void main(String[] args) {
     //6)Write a program to swap 2 numbers without a temporary variable?

        int a=20;
        int b=40;
        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("int a = "+a);
        System.out.println("int b = "+b);
    }
}
