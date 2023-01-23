package HomeWorkDay12;
import java.sql.SQLOutput;

public class Task1{

    public static void main(String[] args) {
        /*
        Task 1:
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle
        of the String.
        For Example String str=hello =>l
         */

        String string = "Table";


        int length = string.length();
        if (!string.isEmpty()){
            if (length % 2 != 0 &&  length> 3) {
                int charMiddle = (length / 2);
                System.out.println(string.charAt(charMiddle));
            }
        }


    }
}
