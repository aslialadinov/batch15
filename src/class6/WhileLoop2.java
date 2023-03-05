package class6;

public class WhileLoop2 {
    public static void main(String[] args) {

         int number=1;
         while (number<5){
             System.out.println(number);
             number++;
         }

        System.out.println("************");
         int number2=0;
         while (number2<10){
             System.out.println(number2);
             number2+=2;
         }
        System.out.println("***********");

         int number3=1; // Task 1
         while (number3<100){
             System.out.println(number3);
             number3++;
         }
        System.out.println("***************");

         int number4=5; // Task 3, loop to print numbers from 1 to 100
         while (number4<=50){
             System.out.println(number4);
             number4+=5;
         }
        System.out.println("********");

         int number5=1;  //Task 2
        while (number5<=15){
            System.out.println(number5);
            number5+=2;
        }
    }
}
