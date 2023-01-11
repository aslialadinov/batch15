package HomeWorkDay2;

public class VariablesStudentInfo {
    public static void main(String[] args) {
        /*3) Create a Java program and name it Variables
In your program create different type of variables to store student’s information and then print value of those variables:
name
lastName
grade
city
state
phoneNumber
b)   Change student’s city, state, phone number and grade. And print those updated values.*/
        String name= "Aisha";
        String lastName= "Aladinov";
        char grade= 'A';
        String city= "Erie";
        String state= "Pennsylvania";
        String phoneNumber= "+(520)245-9077";
        System.out.println("First name= "+name);
        System.out.println("Last name= "+lastName);
        System.out.println("Grade= "+grade);
        System.out.println("City= "+city);
        System.out.println("State= "+state);
        System.out.println("phoneNumber= "+phoneNumber);
        //b) Change students city,state,phone number and grade and print those updated values.
        city= "columbus";
        state= "Ohio";
        phoneNumber= "+1(546)654-7659078";
        grade= 'C';
        System.out.println("Reassign City="+ city);
        System.out.println("Reassign State="+ state);
        System.out.println("Reassign phoneNumber="+ phoneNumber);
        System.out.println("Reassign Grade="+ grade);


    }
}
