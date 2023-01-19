package HomeWorkDayProject;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*1)Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
            sum=sum + numbers[i];
        }
        System.out.println("Sum of elments is "+sum);
    }
}
