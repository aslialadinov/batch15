package class33;

import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) throws FileNotFoundException {

        //String path=null;
        //FileInputStream=new FileInputStream(path);

        String name="Abeera";
        if(name.length()<8){
            throw new RuntimeException("This name is not allowed");
        }

        String name1="Tarik";
        if(name.length()<8){
            throw new LazyException("Lazy Person Found");
        }

    }
}
