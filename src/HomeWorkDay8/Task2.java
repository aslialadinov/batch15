package HomeWorkDay8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 2) Create a program that will be asking user to apply for a credit card 10 times.
        // As soon you get an “yes” from a user program should stop asking.

        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to apply for a credit card?");
        String answer =input.nextLine();

        for(int a = 0; a <= 10; a++) {
            System.out.println(a+" Please try again");
            answer=input.nextLine();
            if(answer.equalsIgnoreCase("Yes")) {
                System.out.println("Congradulations your application is approved for a credit card!");
                break;
            }

        }

    }
}
