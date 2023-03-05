package HomeWorkDay17;

public class Student {

    /*
    5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
    */
     String name;
     String address;


     Student(String name1, String address1){
         name=name1;
         address=address1;
     }
     void printInfo(){
         System.out.println("Student name is "+name+" address "+address);
     }
}
