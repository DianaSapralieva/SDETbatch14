package class29;

import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path = "Data/Test.xlsx";
        var properties = ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));


        String excelPath = "Data/Test.xlsx";
        var excelData = ExcelReader.read(excelPath);
        System.out.println(excelData);

    }
}
