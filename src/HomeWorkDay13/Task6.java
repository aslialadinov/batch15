package HomeWorkDay13;

public class Task6 {
    public static void main(String[] args) {
        //6) How would you swap  2 strings without a temporary variable?
        String a="Java";
        String b="Class";

        System.out.println("Before swapping a is: "+a+" b is: "+b);

        a=a+b;
        b= a.substring(0, a.length()-b.length());
        a= a.substring(b.length());

        System.out.println("After swapping a is: "+a+" b is: "+b);


    }
}
