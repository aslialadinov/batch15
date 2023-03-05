package class17;

public class Task2 {
    /*
    Create a method that will take a String as a parameter
     and returns reversed String.
     Method should be available to all classes within your project
     and accessible by class name.
    */
// Static methods can be called by just writing the name of the class .method name
   public static String reverseStr(String input){
      return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.reverseStr("Monday");
// if we are within the same class we dont need the class name as well
    }
}
