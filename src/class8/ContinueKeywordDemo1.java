package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {

            if(i%3==0) {
                continue; //skip
            }else {
                System.out.println(i);

            }
            System.out.println("Hello Java");
        }
        System.out.println("***************************");

        for(int a= 0; a< 10; a++) { //same as a==3 || a==6 || a==9

            if(a%3==0) {
                continue;
            }
            System.out.println(a); //Line is never  executed when a =3,6,9
        }
    }
}
