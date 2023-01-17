package HomeWorkDay9;

public class Task5 {
    public static void main(String[] args) {
        // 5) Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int[] numbers= new int[5];
        numbers[0]=12;
        numbers[1]=5;
        numbers[2]=7;
        numbers[3]=4;
        numbers[4]=9;


        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum=sum + numbers[i];
        }
        System.out.println("Sum of all elements is "+sum);

    }
}
