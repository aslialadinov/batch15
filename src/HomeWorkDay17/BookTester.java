package HomeWorkDay17;

public class BookTester {
    public static void main(String[] args) {
        Book book1=new Book("Snow white",20.99,"SK47854");
        book1.printInfo();

        Book book2=new Book();
        book2.printInfo();
    }
}
