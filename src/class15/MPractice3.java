package class15;

public class MPractice3 {

    /*
    create a method that takes an array of int sum of all the elements from the array
    return type => int
    name of method => arraySum
    parameters= int[] arr
    */

    int arraySum(int [] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
       return sum;
    }


}
