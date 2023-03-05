package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> fruits=new HashMap<>();// duplicates not allowed
        fruits.put("Apple",1.99);
        fruits.put("Orange",2.99);
        fruits.put("Banana",4.99);
        fruits.put("Kiwi",5.99);
        fruits.put("Apple",5.99);//it retains last duplicate and executes that last value
        fruits.put(null,null);
        System.out.println(fruits);

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.0);
        makeup.put("mascara",20.0);
        makeup.put("eyeliner",12.2);
        makeup.put("Blushon",15.2);

        HashMap<String, Double> groceries=new HashMap<>();
        groceries.putAll(fruits);
        groceries.putAll(makeup);
        System.out.println(groceries);

    }
}
