package HomeWorkDay3And4;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*Create a Java program that will ask user to input city and temperature.
         Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please inter your city");
        String city=input.nextLine();
        System.out.println("Please enter your temperature");
        double Temperature= input.nextDouble();
        System.out.println("The temperature in "+city+ " is " + " " +(Temperature+ -32) *5/9);

    }
}
