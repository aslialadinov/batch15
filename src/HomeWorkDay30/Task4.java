package HomeWorkDay30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        /*4)Create the collection that will store single uniques Objects
         of a String type in which order is preserved.
         Write a logic to concatenate all string from the collection.
         */
       LinkedHashSet<String> s=new LinkedHashSet<>();
       s.add("I");
       s.add("want");
       s.add("a");
       s.add("good");
       s.add("job");

        for (String s1 : s) {
            System.out.print(s1+" ");
        }
    }
}
