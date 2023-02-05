package HomeWorkDay19;

public class A2Test {
    public static void main(String[] args) {
        A2 mom=new A2();
        mom.name="Alisa";
        mom.yourName();
        System.out.println(mom.name);

        B2 son=new B2();
        son.name="Adem";
        son.age=30;
        son.yourAge();
        System.out.println(son.name+" "+son.age);

        C2 grandson=new C2();
        grandson.name="Sabir";
        grandson.age=5;
        grandson.gender="M";
        grandson.yourAge();
        System.out.println(grandson.name+grandson.age+grandson.gender);
    }
}
