package HomeWorkDayProject;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*2)Using Scanner create an array of countries.
        When an array is created, retrieve all values from it and while retrieving those values print capital for
        each country. (use 2 different loops).
        */
        Scanner input=new Scanner(System.in);

        String [] countries =new String[5];
        String [] capitals =new String[5];

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Please enter the country");
            countries[i] = input.next();

            for (int j = 0; j < capitals.length; j++) {
                System.out.println("Please enter the capitals");
                capitals[j]= input.next();
                System.out.println("The capital of the "+countries[i]+" is "+capitals[j]);
            }
            System.out.println();

        }
        int a = 0;
        while (a < countries.length && a < capitals.length) {
            System.out.println("Please enter The Countries");
            countries[a] = input.next();
            System.out.println("Please enter the Capitals");
            capitals[a] = input.next();
            System.out.println("The Capital of the County " + countries[a] + " is " + capitals[a]);
            System.out.println();
            a++;
        }

    }
}
