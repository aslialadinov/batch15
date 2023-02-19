package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        // add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sma");
        names.add("Slava");
        names.add("Diana");
        names.add("Zahra");
        System.out.println(names);
        names.clear();// removes everything
        System.out.println(names);
    }
}
