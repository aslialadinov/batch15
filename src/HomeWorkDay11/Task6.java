package HomeWorkDay11;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        // Create 2D array of countries: north america countries, south america countries,
        // europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how
        // many total countries
        // been stored
        String[][] countries = {{"Canada", "United States", "Mexico"},
                {"Brazil", "Argentina", "Colombia", "Peru"},
                {"France", "Germany", "Italy", "Spain", "United Kingdom"},
                {"China", "India", "Japan", "South Korea", "Russia"},
                {"Nigeria", "Egypt", "South Africa", "Algeria"}
        };
        int count = 0;

        for (String[] one : countries) {
            System.out.println(Arrays.toString(one));
        }

       System.out.println("************************************");

        for (int i = 0; i < countries.length; i++) {
            System.out.println(Arrays.toString(countries[i]));
        }

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
            }
        }
        System.out.println("The number of countries are " + count);
    }
}
