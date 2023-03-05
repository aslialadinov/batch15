package class7;

public class ForLoops {
    public static void main(String[] args) {
        //Prints number from 0 to 9.
        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }


        for (int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }
        //using a for loop print ood  number from 1 to 20
        for(int a = 1; a<=20; a+=2){
            System.out.println(a);
        }
    }

}