package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Please enter a number");
            number=scanner.nextInt();
        }while (number!=5);

        int number1=0;
        while(number1!=5){
            System.out.println("Please enter number");
            number1=scanner.nextInt();
        }

    }
}
