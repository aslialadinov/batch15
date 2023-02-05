package HomeWorkDay19;

public class A2 {
    /* Write program for multilevel inheritance where class C inherits from
       class B and Class B inherits from Class A.
     */
    String name;
    void yourName(){
        System.out.println("My name is Asli");
    }
}
class B2 extends A2 {
    int age;

    void yourAge(){
        System.out.println("my age is 30");
    }
}

class C2 extends B2 {
    String gender;
    void yourGender(){
        System.out.println("My gender is male");
    }
}

