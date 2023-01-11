package HomeWorkDay5;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        /*4)  Write a program for user to enter his/hers birth month.
        Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.
        */
        Scanner input= new Scanner(System.in);
        System.out.println("Pleas enter your birth month");

        String month=input.next();
        String season;

        if(month.equals("April") || month.equals("May") || month.equals("June")){
            season = "Spring";
        } else if(month.equals("July") || month.equals("August") || month.equals ("September")){
            season = "Summer";
        }else if(month.equals("October") || month.equals("November") || month.equals("December")){
            season="Autumn";
        }else if(month.equals("January") || month.equals("February") || month.equals("March")){
            season="Winter";
        } else{
            season="Invalid month";
        }
        System.out.println("You were born in "+season);

    }
}
