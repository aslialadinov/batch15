package HomeWorkDay9;

public class Task4 {
    public static void main(String[] args) {
        /*4) Create an array that can store names of cars and store 6 elements into it.
         Print all values from the array.
        */
        String [] cars= new String [6];
        cars[0]="Maserati";
        cars[1]="Mercedes";
        cars[2]="Cadilac";
        cars[3]="BMW";
        cars[4]="Lexus";
        cars[5]="Tesla";

        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
    }
}
