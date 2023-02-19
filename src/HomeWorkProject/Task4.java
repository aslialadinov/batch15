package HomeWorkProject;

public class Task4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] numbers = new int[3][3];
        int[] row0 = {12, 13, 14};
        int[] row1 = {45, 46, 47};
        int[] row2 = {22, 24, 25};

        numbers[0] = row0;
        numbers[1] = row1;
        numbers[2] = row2;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }


            }


        }
    }

}