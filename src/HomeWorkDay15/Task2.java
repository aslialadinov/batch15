package HomeWorkDay15;

public class Task2 {

    // 2) Create a method that will take a number and prints whether the number is even or odd.

    String number(int num1) {
        if (num1 % 2 == 0) {
            return num1 + " is even number.";

        } else {
            return num1 + " is odd number.";
        }
    }

    public static void main(String[] args) {
        Task2 evenodd=new Task2();
        System.out.println(evenodd.number(25));
    }
}