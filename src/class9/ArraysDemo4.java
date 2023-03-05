package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {

        // Create an array to store letters A B c d e f

        char [] letters={'A', 'B', 'c', 'd','e', 'F'};
        letters[0]='a'; // this is how to update
        for (int i = 0; i < letters.length ; i++) {
            System.out.println(letters[i]);
        }
    }
}
