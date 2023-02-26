package HomeWorkDay29;

import java.util.HashMap;

public class Task2 {
    //Create a Set collection that will hold Objects of Student Type.
    // In this set we do not care about the insertion order.
    // Each student object should have name and studentID.
    // Display name of each student.
    public static void main(String[] args) {
        HashMap<String,Integer> studentType=new HashMap<>();
        studentType.put("Olivia",12456);
        studentType.put("Maxim",98456);
        studentType.put("Natalia",12545);
        studentType.put("Zamira",555412);
        studentType.put("Olga",124578);
        studentType.put("Steven",123324);
        System.out.println(studentType);
        System.out.println(studentType.keySet());

    }
}
