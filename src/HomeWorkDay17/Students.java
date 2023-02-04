package HomeWorkDay17;

public class Students {
    /*
    2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
     NOTE: please use different names for instance and local variables.
     */

    String name;
    double art;
    double math;
    double music;
    double average;

    Students(String sName,double sArt,double sMath, double sMusic){
        name=sName;
        art=sArt;
        math=sMath;
        music=sMusic;

        average=(sArt+sMath+sMusic)/3;
    }
    void printInfo(){
        System.out.println("Student name "+name+" an average grade is "+String.format("%.1f",average));
    }

}
