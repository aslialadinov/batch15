package HomeWorkDay20;
/*
2. Create an Employee class that will have variables and methods.
Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
*/
public class Employee {
    String name;
    int age;

    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    void printInfo(){
        System.out.println("Employee name is: "+name+"\n"+" Employee age is: "+age);
    }
}
class FullTime extends Employee{
    String empID;
    FullTime(String name,int age,String empID){
        super(name,age);
        this.empID=empID;
    }
    void printempID(){
        System.out.println("Employee ID: "+empID);
    }
}
class PartTime extends Employee{
    String gender;
    PartTime(String name,int age,String gender){
        super(name,age);
        this.gender=gender;
    }
      void printAll(){
          System.out.println("Employee gender is: "+gender);
      }
}
class TesterSubClass extends FullTime {
    int bonus;
    TesterSubClass(String name,int age,int bonus,String empID){
       super(name,age,empID);
        this.bonus=bonus;
    }
    void printAll2(){
        System.out.println("Employee bonus is: "+bonus);
    }

    public static void main(String[] args) {
        TesterSubClass ts=new TesterSubClass("Natali",25,1000," hdgf1457");
        ts.printInfo();
        ts.printempID();
        ts.printAll2();
    }
}