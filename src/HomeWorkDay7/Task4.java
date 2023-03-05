package HomeWorkDay7;

public class Task4 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        for (int i= 21; i<=50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("***********");

        for (int a =20; a<=50; a++){
            if(a%2!=0){
                System.out.print(a+" ");
            }
        }
    }
}
