package class13;

public class StringRecap {
    public static void main(String[] args) {

        String str = "Java is Great"; // to print all the characters one by one
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // What is the input to the charAt() method its int out is a char
        // count how many times the letter a has appear in the above string
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letters a has appeared "+count+" Many times");
    }
}