package HomeWorkDay6;

public class Task4 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        System.out.println("Method: 1");
        int num=0;
        while(num<=20){
            System.out.println(num);
            num+=2;
        }
        System.out.println("Method: 2");
        int num1=0;
        while(num1<=20) {
            if(num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }

        }
    }

