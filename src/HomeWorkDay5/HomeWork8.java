package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        /*Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade
        --> Not Acceptable. At the end your program should print which grade
        was entered by a user with explanation.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter grade (A,B,C,D)");
        char grade= input.next().charAt(0);

        if(grade=='A'){
            System.out.println("Your grade is "+grade+" Excellent");
        }else if(grade=='B'){
            System.out.println("Your grade is "+grade+" Good");
        }else if(grade=='C'){
            System.out.println("Your grade is "+grade+" Average");
        }else {
            System.out.println("Your grade is "+grade+" Bad");
        }
        }


    }

