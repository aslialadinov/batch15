package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*3) Write a program that will read three inputs of scores
        (quiz, midterm, and final scores) and determine the grade based on the following rules:
         if the average score >=90 → grade=A
         if the average score >= 70 and <90 → grade=B
         if the average score>=50 and <70 → grade=C
         if the average score<50 → grade=F
        */

        int average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your quiz Score?");
        int quiz = sc.nextInt();
        System.out.println("Please enter mid term score:");
        int midterm = sc.nextInt();
        System.out.println("Please enter final score");
        int finalscore = sc.nextInt();
        average = (quiz+midterm+finalscore)/3;

        if  (average >90) {

            System.out.println("Your Score is "+average+". Which is a grade A");
        }

        else if(average >=70 && average < 90 )
            System.out.println("Your Score is "+average+". Which is a grade B");

        else if (average >= 50 && average <= 70) {

            System.out.println("Your Score is "+average+". Which is a grade C");
        }

        else {
            System.out.println("Your Score is "+average+". Which is a grade F");
        }

    }
}
