package HomeWorkDay17;

public class Task1 {
    /*
    1) Write a java class that will have a constructor: one with parameters and
     second without any parameters.
    Create a separate Test class where you will execute
    both of the constructors 1 by 1.
     */

    String catName;
    int catAge;
    double catWeight;

    Task1(String  Name, int Age,double Weight){
        catName=Name;
        catAge=Age;
        catWeight=Weight;
    }
    Task1(){
        catName="Snejok";
        catAge=3;
        catWeight=6;
    }

    void display1(){
        System.out.println("Name "+catName+" age "+catAge+" weight "+catWeight);
    }

}
