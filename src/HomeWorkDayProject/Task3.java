package HomeWorkDayProject;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int[][] num={ {10,20,30},
                      {12,13,41},
                      {41,12,13,},
        };
        int sum=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num.length ; j++) {
                sum=sum+num[i][j];
            }

        }
        System.out.println("Sum of elements is "+sum);



    }

}
