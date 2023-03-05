package class27;

public class BoxingDemo {
    public static void main(String[] args) {

       int number=15;
       printData(number);

       Integer f=10; //autoBoxing
        int number2=f;

    }

    public static void printData(Integer number){ // auto boxing
        System.out.println(number);
    }
}
