package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ReadingExelFileDemo1 {
    public static void main(String[] args) throws IOException {
        //we need to know path of the file
        String path = "Data/Test.xlsx";
        //navigate to this path
        FileInputStream fileInputStream = new FileInputStream(path);
        //that special file that can handle the xlsx files
        XSSFWorkbook excel = new XSSFWorkbook(fileInputStream);
        //Getting to the Sheet inside the Excel file where data is stored
        Sheet sheet = excel.getSheet("Sheet1");

        int numOfRow = sheet.getPhysicalNumberOfRows();

        Row headerRow = sheet.getRow(0);//getting the first row so we can use as keys for our map
        LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();


        for (int rowNo = 1; rowNo < numOfRow; rowNo++) {
            Row dataRow = sheet.getRow(rowNo); //get a row from the sheet one by one throught the loop

            int numOfCell = dataRow.getPhysicalNumberOfCells();
            for (int cellNo = 0; cellNo < numOfCell; cellNo++) {

                rowMap.put(headerRow.getCell(cellNo).toString(), dataRow.getCell(cellNo).toString());

            }

            System.out.println(rowMap);


        }
    }
}
