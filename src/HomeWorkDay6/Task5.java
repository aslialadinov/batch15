package HomeWorkDay6;

public class Task5 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int num=20;
        while(num<=50){
            if(num%2!=0){
                System.out.println(num);
            }
            num++;
        }
        System.out.println("Method: 2");
        int num1=21;
        while(num1<50){
            System.out.println(num1);
            num1+=2;
        }

    }
}
