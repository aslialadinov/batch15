package HomeWorkDay30;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*
         2) Create a Person class with following private fields: name, lastName, age, salary.
         Variables should be initialized through constructor.
         Inside the class also create a method to print user details.
         In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
       */
      TreeMap<Integer,Person> person=new TreeMap<>();
      person.put(4512,new Person("Hiral","Jethva",25,90000));
      person.put(5874,new Person("Abeera","Akhmed",26,90000));
      person.put(3654,new Person("Daria","Ostrenko",27,90000));

        var entrySet=person.entrySet();
        for(var entry:entrySet){
            System.out.println("User ID "+entry.getKey());
            entry.getValue().print();
        }
    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void print(){
        System.out.println(name+" "+age+" years old "+" and salary is "+salary);
    }
}