package class16;

import java.util.Scanner;

public class Person {
    private double bankBalance=12450000;
    String Address="Street 123"; // default access level is applieds
   public String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("pass1234");
    }

    void printSSN(){
        System.out.println("124578963");
    }

    public void printTikTokAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }

}
