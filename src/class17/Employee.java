package class17;

public class Employee {
    String name;
    String department;
    double salary;
    String id;
    int age;
    double actualSalary;
    static String companName = "Syntax";

    Employee(String empName, String empDepartment, double empSalary, int empAge) {
        name = empName;
        department = empDepartment;
        salary = empSalary;
        age = empAge;

    }

    void printSalary() {
        double actualSalary = salary + 20000 + 10000;
        System.out.println(actualSalary);
    }

    void calculatePrintTax() {
        double tax = actualSalary * .3;
        System.out.println("tax = " + tax);
    }


}
