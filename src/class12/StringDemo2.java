package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        // only converts the upper case to lowercase

        String str="java is FUN 12345@!$%";
        String  newStr=str.toLowerCase();
        System.out.println(newStr);

        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);

    }
}
