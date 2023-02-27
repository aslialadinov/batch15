package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> students=new HashMap<>();
        students.put(1,"Nzir");
        students.put(2,"Safi");
        students.put(3,"Lisa");
        students.put(4,"Aisha");

        System.out.println(students);
        System.out.println(students.get(3));
        System.out.println(students.size());// tells us how many sets we have
        System.out.println(students.containsKey(5));
        System.out.println(students.containsValue("Aisha"));// this way search for values
        System.out.println(students.remove(4));
        System.out.println(students);
        System.out.println(students.replace(2,"Asli"));
        System.out.println(students);
    }
}
