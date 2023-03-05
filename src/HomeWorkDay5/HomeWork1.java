package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        /* 1) Prompt the user to enter person heights in inches.
        Person should be classified as one of the following:
     • short (under 60 inch)
     • medium(between 60 -72 inch)
     • tall (over 72 inch)
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height=sc.nextInt();

        if(height<=60 && height <= 72) {
            System.out.println("Your height is " + height + ". Therefore, you are short");

        } else if (height >= 60 && height <= 72) {

                System.out.println("Your height is "+height+". Therefore, you are medium");
            }
            else {
                System.out.println("Your height is "+height+". Therefore, you are tall");
            }
        }
    }







