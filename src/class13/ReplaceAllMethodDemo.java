package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kJJJmkfjvgkjf454563@#$%";
        // Replaces All upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        // Replaces all lower case a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        // Replaces All lower case letters from 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        // Replaces All lower letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //replaces all lower case letters from A-Z and lower case letters from a-z and numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // do not replace All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

    }
}
