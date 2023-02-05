package HomeWorkDay19;

public class Teacher {
    /*
   3)  Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
     Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their
     own features and behaviour. Test all 4 classes
     */

    String name;
    int age;

    String teacherID;
    String password;
    public static String subject;

    void teacherInfo(){
        System.out.println("Name "+name+" ,age: "+age+", Teacher ID: "+teacherID+", Password: "+password );
    }
}
class MathTeacher extends Teacher{
    int experience;

    void teacherMath(){
        System.out.println("Teaching math: ");
    }
}

class ChemistryTeacher extends Teacher{
    int experience2;

    void teacherChemistry(){
        System.out.println("Teaching chemistry");
    }
}
class PianoTeacher extends Teacher{

    void pianoTeacher(){
        System.out.println("Playing piano ");
    }
}
