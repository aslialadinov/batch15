package HomeWorkDay11;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //2) Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String [][] cars={{"American:","Ford","GMC"},
                          {"German:","BMW","Mercedes"},
                          {"Korean:","KIA","Hyunday"},
        };
        for(String[] car:cars){
            System.out.println((Arrays.toString(car)));
        }
        System.out.println("Method 2");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(Arrays.toString(cars[i]));

        }
    }
}
