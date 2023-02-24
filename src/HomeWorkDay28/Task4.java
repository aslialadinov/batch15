package HomeWorkDay28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Latte");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Juice");
        for (int i = 0; i <drinks.size() ; i++) {
            if(drinks.contains("a")||drinks.contains("e")){
            }
            drinks.set(i,"Water");
        }
        System.out.println(drinks);
    }
}
