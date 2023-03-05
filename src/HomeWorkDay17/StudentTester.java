package HomeWorkDay17;

public class StudentTester {
    static int count;
    public static void main(String[] args) {

        Student aisha=new Student("Aisha", "1425 Raspberry street");
        count++;
        aisha.printInfo();


        Student aysel=new Student("Aysel", "1255 Lemon street");
        count++;
        aysel.printInfo();

        Student songul=new Student("Songul", "7894 Blueberry street");
        count++;
        songul.printInfo();

        System.out.println("Number of students "+StudentTester.count);


    }
}
