package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        /* 1 2 3 4 5
          1 2 3 4 5
         */

        for (int i = 0; i < 3; i++) { // outer for loops tells you how many lines

            for (int j = 1; j <= 5; j++) { // inner for loop the condition like from 1 to 5 to print

                System.out.print(j + " "); // print value of j from 1 to 5

            }
            System.out.println();

        }

        }
    }
