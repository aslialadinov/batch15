package HomeWorkDay17;

public class Book {
    /*
    6) Write Book class that will have instance variables and 2 Constructors.
     While creating an object make sure:
     Instance variables are being initialized
     Both Constructors are being executed
    */

    String name;
    double price;
    String code;

    Book(){
        name="Lost in town";
        price=25.99;
        code="AZ4758";
    }
    Book(String name1,double price1,String code1){
        name=name1;
        price=price1;
        code=code1;
    }
    void printInfo(){
        System.out.println("Book name is "+name+" price "+price+" $ "+" code "+code);
    }
}
