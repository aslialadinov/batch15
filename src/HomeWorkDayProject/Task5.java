package HomeWorkDayProject;

public class Task5 {
    public static void main(String[] args) {
        //5)Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.
         int [][] numbers={ {10,27,30,77},
                            { 43,50,60,33},
         };
         int sum=0;
         int sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
           if(numbers[i][j]%2==0){
               sum+=numbers[i][j];
           }else{
               sum1+=numbers[i][j];
           }

            }

        }
        System.out.println("Sum of the even numbers "+sum);
        System.out.println("Sum of the odd numbers "+sum1);
    }
}
