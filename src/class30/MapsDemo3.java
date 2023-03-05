package class30;

import java.util.HashMap;

public class MapsDemo3 {
    /*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/
    public static void main(String[] args) {

        HashMap<Integer,String> store=new HashMap<>();
        store.put(1,"Google");
        store.put(2,"Syntax");
        store.put(3,"Selenium");
        store.put(4,"SDLC");
        store.put(5,"Manual");
        store.put(6,"Safari");
        store.put(7,"Manual");

        System.out.println(store.size());

        store.replace(4,"Happy");
        System.out.println(store);

        store.remove(7);
        System.out.println(store);
    }
}
