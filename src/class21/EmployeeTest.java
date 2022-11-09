package class21;

public class EmployeeTest {
    public static void main(String[] args) {

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculateSalary();

        Tester tester=new Tester();
        tester.calculateSalary();

        Developer developer=new Developer();
        developer.calculateSalary();
    }
}
