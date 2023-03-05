package HomeWorkDay29;

import java.util.TreeSet;

public class Task3 {
    //Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Turekey");
        countries.add("India");
        countries.add("Russia");
        countries.add("Portugal");
        countries.add("Morocco");
        System.out.println(countries);

        for(String x:countries){
            System.out.println(x+" ");
        }

    }
}
