package HomeWorkDay15;

public class Task4 {
    // 4)Create a method that will say Hello in different language based on the country that will pass when method is executed

    String hello(String country){
        switch (country.toLowerCase()){
            case "russia":
                return "Привет";
            case "turkey":
                return "Merhaba";
            case "india":
                return "हेलो";
            case "morocco":
                return "Assalamu-Alikum";
            default:
                return "Wrong input";
        }
    }

    public static void main(String[] args) {
        Task4 input=new Task4();
        System.out.println(input.hello("india"));
    }
}
