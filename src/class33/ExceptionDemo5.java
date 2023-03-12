package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo5 {
    public static void main(String[] args){
        try {
            FileInputStream fileInputStream=new FileInputStream("");
        }catch (FileNotFoundException e){

        }
        // or
        // throw the exception in Main method
        //public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream=new FileInputStream("");

        String name="Abracadabra";
    }
}
