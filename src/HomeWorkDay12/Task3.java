package HomeWorkDay12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*3) Write a program that reads two people's first
            names and if they expecting boy or girl?
            Based on the input suggests a name for a baby:
            Example Output:
            Example Output:                            Example Output:
            Mom’s first name? Mary                     Mom’s first name? Mary
            Dad’s first name? Daniel                   Dad’s first name? Daniel
            Boy or Girl? boy                           Boy or Girl? girl
            Suggested baby name: DANRY                 Suggested baby name: MAIEL
        */

        Scanner input= new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Moms first name? ");
            String momsFirstName= input.next();

            System.out.println("Dads first name? ");
            String dadsFirstName = input.next();

            System.out.println(" Boy or Girl? ");
            String babyName= input.next();

            String suggestedName;

            if(babyName.equalsIgnoreCase("Boy")){
                suggestedName= dadsFirstName.substring(0,3) +momsFirstName.substring(2);
                System.out.println(suggestedName.toUpperCase());
            }else if (babyName.equalsIgnoreCase("Girl")){
               suggestedName= momsFirstName.substring(0,2) +dadsFirstName.substring(3) ;
                System.out.println(suggestedName.toUpperCase());
            }


        }
    }
}
