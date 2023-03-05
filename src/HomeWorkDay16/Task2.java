package HomeWorkDay16;

public class Task2 {
    /*
    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    */
    public String reverseString(String str){
        String newString="";
        for (int i =str.length()-1; i >=0 ; i--) {
          newString+=str.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        System.out.println(task2.reverseString("Table"));
    }
}
