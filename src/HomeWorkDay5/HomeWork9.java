package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
   /* HomeWork: Using scanner class create calculator.
   Allow user to enter 2 numbers and operator(+,-,*,/).
   Based on operator provide the result to user.
   */
   Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = input.nextDouble();
        System.out.println("Please enter second number");
        double num2 = input.nextDouble();
        System.out.println("Enter operators (+ - * /");
        char operator = input.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition value: "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction value: "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication value: "+result);
                break;
            case '?':
                result = num1 / num2;
                System.out.println("Division value: "+result);
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
