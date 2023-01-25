package HomeWorkDay12;

public class Task2 {
    public static void main(String[] args) {
       //2) Create a String and print it in reverse order (Sunday → yadnuS).

        String day="Sunday";
        String reverse= "";
        for (int i = 0; i <day.length();i++) {
            reverse=day.charAt(i)+reverse;

        }
        System.out.println(reverse);
    }
}
