package class26;

import java.util.HashSet;

public class Student {

    String name;
    String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    void displayName() {
        System.out.println(name);
    }

}

class Task6 {

    public static void main(String[] args) {
        /*Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
         Display name of each student.*/

        Student Diana = new Student("Diana", "32344");
        Student Yasmina = new Student("Yasmina", "45665");
        Student Adam = new Student("Adam", "45984");
        Student Philippe = new Student("Philippe", "454");
        Student Timerlan = new Student("Timerlan", "456543");

        HashSet<Student> studentId = new HashSet<>();
        studentId.add(Diana);
        studentId.add(Yasmina);
        studentId.add(Adam);
        studentId.add(Philippe);
        studentId.add(Timerlan);

        for (Student student : studentId) {
            student.displayName();
        }
    }
}
