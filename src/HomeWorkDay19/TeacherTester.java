package HomeWorkDay19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.name="Asel";
        teacher1.age=30;
        teacher1.teacherID="ABC123";
        teacher1.teacherInfo();

        System.out.println("*************************");

        MathTeacher mathTeacher1=new MathTeacher();
        mathTeacher1  .name="Asghar";
        mathTeacher1.age=29;
        mathTeacher1.teacherID="kloi4578";
        mathTeacher1.experience=10;
        mathTeacher1.subject="Math";
        System.out.println("Subject "+MathTeacher.subject);
        mathTeacher1.teacherMath();
        System.out.println("Years of experience "+mathTeacher1.experience);

        System.out.println("********************************");

        ChemistryTeacher chemTeacher1=new ChemistryTeacher();
        chemTeacher1.name="Ms Elizabeth";
        chemTeacher1.age=28;
        chemTeacher1.teacherID="hfghjt74565";
        chemTeacher1.experience2=4;
        chemTeacher1.subject="Chemistry";
        chemTeacher1.teacherChemistry();
        System.out.println("Subject: "+chemTeacher1.subject);

        System.out.println("************************************");

        PianoTeacher pianoTeacher1=new PianoTeacher();
        pianoTeacher1.name="Ms Loans";
        pianoTeacher1.age=35;
        pianoTeacher1.teacherID="gdshfg4578";
        pianoTeacher1.subject="Piano";
        pianoTeacher1.teacherInfo();
        System.out.println("Subject: "+PianoTeacher.subject);

    }
}
