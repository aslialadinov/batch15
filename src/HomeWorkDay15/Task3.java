package HomeWorkDay15;

public class Task3 {
    // 3) Create a method that will print whether given String is palindrome or not.
    boolean palindromeStr(String myStr){
        String reverseStr =new StringBuilder(myStr).reverse().toString();
        if (myStr.equals(reverseStr)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Task3 result =new Task3();
        System.out.println(result.palindromeStr("level"));
    }

}
