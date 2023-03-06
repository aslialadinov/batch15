package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {
        //Path where we want to create the new file the nameof the file with its extension
        String path="Files/config.properties";

        // We use FileOutputStream when we have to write the data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();

        //We use the setProperty method to store data inside a properties files
        properties.setProperty("Name","Anees");

        //A method to write the add to the disk
        properties.store(fileOutputStream,"A new name has been added");


    }
}
