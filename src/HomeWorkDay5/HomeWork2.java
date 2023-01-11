package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /* 2) Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output
        “It is a weekend”, any other day → output “Invalid day” (edited)
        */
      Scanner input=new Scanner(System.in);
        System.out.println("Please enter any number starting from 1");
        int number=input.nextInt();

        if(number>=1 && number<=5){
            System.out.println("It is a week day");
        }if(number>=6 && number<=7){
            System.out.println("It is a weekend");
        } else{
            System.out.println("Invalid day");
        }



    }
}
