package HomeWorkDay11;

public class Task4 {
    public static void main(String[] args) {
        // 4)Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.

        int[][] store ={ {10,20,30},
                          {40,50,60},
                          {70,80,90},

        };
        int sum=0;
        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j <store[i].length ; j++) {
                sum+=store[i][j];
            }
        }
        System.out.println(sum);
    }
}