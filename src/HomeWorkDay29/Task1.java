package HomeWorkDay29;

import java.util.LinkedHashSet;

public class Task1 {
    //Create a Set of cities in which you want to make sure that insertion order is maintained.
    // Then remove any city that starts with “A”;
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Moscow");
        cities.add("Atlanta");
        cities.add("Miami");
        cities.add("New York");
        cities.add("Instanbul");
        cities.add("Dallas");
        cities.removeIf(a->a.startsWith("A"));
        System.out.println(cities);

    }
}
