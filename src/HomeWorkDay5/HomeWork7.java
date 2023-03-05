package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {

        /*7) Ask user to enter their country and capture it.
         Once values are captured print which language user speaks.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country: ");
        String country= input.next();

        switch (country){
            case "Russia":
            case "russia":
                System.out.println("You are from "+country+" and you have selected Russian as a language");
                break;
            case "Turkish":
            case "turkish":
                System.out.println("You are from "+country+" amd you have selected Turkish as a language");
                break;
            case "China":
            case "china":
                System.out.println("You are from "+country+" and you have selected Chinese as a language");
        }

    }
}
