package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        right-click on your file and click copypathreference -> click from Content root
         */

        String path="Data/config.properties";//location of the file
        var fileInputStream=new FileInputStream(path);//navigating to the file
        var properties=new Properties();
        properties.load(fileInputStream);//loads all the data from the file inside (Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();

    }
}
