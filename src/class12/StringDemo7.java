package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";
        boolean startsWith=str.startsWith("I love");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        // Method changing is when multiple methods are called on the same line
        // only those can be chained which returns a string
        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));

    }
}
