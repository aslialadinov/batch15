package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance); because private is used
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printSSN();
        person.printTikTokAccount();
       //person.Password(); can not print because it is private
        String str="bhbfb";
    }
}
