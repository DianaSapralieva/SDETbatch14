package class23;

public abstract class File {
    /*Create a class File that will have the following behaviors:
     open, edit, close. Edit and close are implemented method
      while open is an abstract. Create 3 subclasses: JavaFile,
      WordFile, PdfFile that will provide specific implementation of open behaviour:
      Example: to open .java file we need notepad++ or sublime text,
       to open .doc file we need Microsoft word to be installed etc
     */


    abstract void open();

    void edit() {
        System.out.println("Edit");
    }

    void close() {
        System.out.println("Close");
    }
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}

class PdFile extends File {
    @Override
    void open() {
        System.out.println("to open Pdf File we need to download Adobe Acrobat Reader");
    }
}

class FileTest {
    public static void main(String[] args) {
        File[] file = {new JavaFile(), new WordFile(), new PdFile()};
        for (File files : file) {

            files.open();
            files.edit();
            files.close();

        }
    }
}