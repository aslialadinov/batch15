package class16;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    // return type => void
    // => ispalindrome
    //parameters => String inputStr
    // {
    // }

    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" Not is palindrome");
        }
    }

    public static void main(String[] args) {

   Task3 task=new Task3();
   task.isPalindrome("Kaya"); // can use this only because used void in class

   // String result =task.isPalindrome("kaya")); can not assign void methods to variables


    }


}
