package HomeWorkDayProject2;

public class MarksTester {
    public static void main(String[] args) {
        Marks [] m={new A(44,33,77),new B(44,88,99,55)};

        for (Marks m1:m){
            m1.getPercentage();
        }
    }
}
