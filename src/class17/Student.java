package class17;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students
    name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    int mathGrade;
    int engGrade;
    int germanGrade;

    int average;

    public Student(String name, int mathGrade, int engGrade, int germanGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.germanGrade = germanGrade;
    }

    int printAvarage() {
        average = ((mathGrade + germanGrade + engGrade) / 3);
        return average;

    }

    public static void main(String[] args) {
        Student student1 = new Student("Josh", 77, 44, 66);
        System.out.println("Average grade: " + student1.printAvarage());
        Student student2 = new Student("Alex", 55, 74, 86);
        System.out.println("Average grade: " + student2.printAvarage());
        Student student3 = new Student("Nastya", 55, 66, 66);
        System.out.println("Average grade: " + student3.printAvarage());
        Student student4 = new Student("Philippe", 45, 65, 24);
        System.out.println("Average grade: " + student4.printAvarage());
        Student student5 = new Student("Martine", 42, 97, 59);
        System.out.println("Average grade: " + student5.printAvarage());


    }
}
