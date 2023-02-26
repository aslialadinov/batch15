package class29;


import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

       // Dog d1==new Dog("Jacky","Persian",15);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian",15));
        dogs.add(new Dog("Jami","German",25));
        dogs.add(new Dog("Jummi","Bulldog",35));
        dogs.add(new Dog("Sami","Persian",45));

        for(Dog d:dogs){
            d.printDogName();
        }

    }
}
