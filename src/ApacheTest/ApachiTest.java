package ApacheTest;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachiTest {
    public static void main(String[] args) throws IOException {

        String testApache="C:\\Users\\asala\\OneDrive\\Desktop\\Apache POI\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(testApache);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Row row1=sheet.getRow(1);
        Row row2=sheet.getRow(2);
        Row row3=sheet.getRow(3);
        Row row4=sheet.getRow(4);

        System.out.println(row.getCell(0));
        System.out.println(row.getCell(2));
        System.out.println(row1.getCell(0));
        System.out.println(row1.getCell(3));
        System.out.println(row2.getCell(0));
        System.out.println(row2.getCell(4));
        System.out.println(row3.getCell(0));
        System.out.println(row3.getCell(5));
        System.out.println(row4.getCell(0));
    }

}
