package class10;

public class ArraysDemo1 {
    public static void main(String[] args) {

        int[] num={10,20,30,40,50};
        System.out.println(num[4]);

        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }
        System.out.println("***************************************************************");
        //Enhanced/foreach for loop
        //when ever possible use below loop
        for(int number:num){
            System.out.println(number);
        }
    }
}
