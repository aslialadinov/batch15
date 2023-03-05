package class8;

import java.util.Scanner;

public class Repl63 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int x=input.nextInt();
        for(int i = 0; i < x; i++){
            System.out.print(i+" "); // print prints number in same line+" " adds space after each number
        }
        System.out.println();
    }
}
