package stepDefinition;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataDriven {


    public static void main(String[] args) throws IOException {
//        WebDriver driver;
//        WebDriverManager.chromiumdriver().setup();
//        driver = new ChromeDriver();
        // Provide input path of File
        FileInputStream fis = new FileInputStream("/Users/revan/workspace/Selenium-practise/Book1.xlsx");
        // Declare Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // Get number of sheets available within sheets doc
        int sheets = workbook.getNumberOfSheets();
        // Print number of sheets available
        System.out.println(sheets);
        System.out.println("Great! Program got executed");
        // traverse through sheet using for  and if loop and find the sheet using "Sheet name"
        for(int i=0; i<sheets; i++) {
            if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
                // Start with [row, column][1,1]
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstrow = rows.next();
                Iterator<Cell> cell = firstrow.cellIterator();
                int k = 0;
                int coloumn = 0;
                while (cell.hasNext()) {
                    Cell value = cell.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        coloumn = k;
                    }
                    k++;
                }
                System.out.println(coloumn);
            }

        }
    }

}

