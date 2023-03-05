package class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;

    Student(String studentName,String studentId,int studentAge, double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;

    }
    void printInfo(){
        System.out.println("Name: "+name+" id: "+id+" weight: "+weight);
    }

    public static void main(String[] args) {
        Student student1=new Student("Asli","454lk",25,70);
        student1.printInfo();

        Student student2=new Student("Hiral","457hg",26,60);
        student2.printInfo();

        Student student3=new Student("Abeera","4785fdg",20,80);
        student3.printInfo();

        Student student4=new Student("Tami","85314klj",32,65);
        student4.printInfo();

        Student student5=new Student("Daria","34567jhku",29,59);
        student5.printInfo();
    }
}
