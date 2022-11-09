package class18;

public class Student {
    String studentsName;
    String adress;


    public Student(String studentsName, String adress) {
        this.studentsName = studentsName;
        this.adress = adress;
    }
     void displayInfo(){

        System.out.println("name of the Student: "+ studentsName+"students Adress:"+adress);
     }

    public static void main(String[] args) {
        new Student("Philipppe Nesser "," 1140 Saint Jones st").displayInfo();


    }
}
