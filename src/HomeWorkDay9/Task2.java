package HomeWorkDay9;

public class Task2 {
    public static void main(String[] args) {
        /*2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */
        String[] names = {"Hiral", "Nelson", "Tarik", "Abdul Nasir", "Abeera", "Asli"};
        System.out.println(names[5]);

        System.out.println("--------------------------");
        String[] names2 = new String[6];
        names2[0] = "Hiral";
        names2[1] = "Nelson";
        names2[2] = "Tarik";
        names2[3] = "Abdul Nasir";
        names[4] = "Abeera";
        names2[5] = "Asli";
        for (int i = 0; i < names2.length; i++) {
            if (i == 5) {
                System.out.println(i+" Asli");
            }


        }
    }
}