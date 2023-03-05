package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        var name="jkfjgvgkjf";// only works from Java 10
        var c='s'; // only works from Java 10

        words.removeIf(s -> s.endsWith("a")); // starts working from JAva 8
        System.out.println(words);
    }

    // this is the way of doing with iretator, it works from Java 6 to java 19
     /* while(iterator.hasNext()){
        String s= iterator.next();
        if(s.endsWith("a")){
            iterator.remove();
        }
    }
        System.out.println(words);*/
}
