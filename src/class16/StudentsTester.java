package class16;

public class StudentsTester {
    public static void main(String[] args) {

        Students student1=new Students();
        student1.name="Asli";
        student1.ID="1";
        student1.numberOfStudents++;

        Students student2=new Students();
        student2.name="Hiral";
        student2.ID="2";
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.name="Aisha";
        student3.ID="3";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);


    }
}
