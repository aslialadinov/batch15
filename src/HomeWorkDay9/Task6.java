package HomeWorkDay9;

public class Task6 {
    public static void main(String[] args) {
        /*6) Create an array of countries.
        While retrieving all values from an array print capital for each country choose any five countries.
        */
        String [] country={"France", "Turkey", "Morocco", "India"};
        String [] capitals={"Paris", "Istanbul","Rabat","New Delhi"};
        for (int i = 0; i <country.length ; i++) {
            System.out.println(capitals[i] + " is the capital of "+country[i]);

        }
    }
}
