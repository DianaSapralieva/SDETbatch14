package class22;

public class HomeWorktest {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student student : students) {
            student.student1();
            student.student2();
            student.student3();
        }
    }
}
