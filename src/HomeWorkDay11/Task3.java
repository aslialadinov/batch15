package HomeWorkDay11;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //3) Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String [][] groceries={{"Veggies:","Tomatoes","Potatoes"},
                {"Fruits:","Pineapple","Apples"},
                {"Dairy:","Milk","Cheese"},
                {"Sweets:","Cheesecake","Muffins"},
        };
        for (int i = 0; i < groceries.length; i++) {
            System.out.println(Arrays.toString(groceries[i]));
        }
        System.out.println("Method 2");

        for(String[] list:groceries){
            System.out.println((Arrays.toString(list)));
        }

    }
}
