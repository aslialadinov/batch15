package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.name="ZAfar";
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weight=70;

        Student student1=new Student();
        student1.name="Hamid";
        student1.id="1452";
        student1.schoolName="Syntax";
        student1.age=45;
        student1.weight=80;

        Student student2=new Student();
        student2.name="Hiral";
        student2.id="15452";
        student2.schoolName="Syntax";
        student2.age=25;
        student2.weight=60;

        System.out.println(student2.schoolName);
        System.out.println(student2.schoolName); //another way that might see a lot to access static variable
        System.out.println(student2.name);
    }
}
