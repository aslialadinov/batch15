package HomeWorkDay13;

public class Task5 {
    public static void main(String[] args) {
        //5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String str="begin";
        String str1="";
        for (int i=str.length()-1; i>=0; i--) {
            str1=str1+str.charAt(i);
        }if(str1.equals(str)){
            System.out.println("This is palindrome : "+str);
        }else{
            System.out.println("This is not a palindrome");
        }
    }
}
