package class17;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    Dog(String dogName,String dogBreed, int dogAge,double dogWeight){
   name=dogName;
   breed=dogBreed;
   age=dogAge;
   weight=dogWeight;
    }
    void printInfo(){

        System.out.println("Name: "+name+" Breed: "+breed+" age: "+age+" Weight: "+weight);
    }
    public static void main(String[] args) {

        Dog dog1=new Dog("Poppy","Husky",4,42.2);
        dog1.printInfo();
        Dog dog2=new Dog("Bors","German shepard",5,20);
        dog2.printInfo();
        Dog dog3=new Dog("Laska","Bulldog",7,40);
        dog3.printInfo();
        Dog dog4=new Dog("Buket","Labrador",3,50);
        dog4.printInfo();
        Dog dog5=new Dog("Tuzik","Poodle",6,25);
        dog5.printInfo();



    }
}
