package class28;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> name=new LinkedList<>();
        name.add("Artem");
        name.add("Tammi");
        name.add("Tammar");
        name.add("Sam");
        System.out.println(name); // to print all the names

        for(String l:name){
            System.out.println(l);
        }
    }
}
