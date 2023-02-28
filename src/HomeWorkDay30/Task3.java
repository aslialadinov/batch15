package HomeWorkDay30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static  void main(String[] args) {
        /*
        3)Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary.
        Output should be in the below format John Smith=$100000
       */
        Map<String,Integer>  m=new HashMap<>();
        m.put("Asli",100000);
        m.put("Slava",120000);
        m.put("Tarik",110000);
        m.put("Hiral",100000);
        m.put("Nelson",123000);

        var entrySet=m.entrySet();
        int highest=0;
        String emp="";
     for(var e:entrySet){
         if(e.getValue()>highest){
             highest=e.getValue();
             emp=e.getKey();
         }
     }
        System.out.println(emp+"=$" +highest);
    }
}
