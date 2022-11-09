package class22;

public class HomeWork {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent,
    CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/
}

class Student {
    void student1() {
        System.out.println("this is parent class method specific for SyntaxStudents ");
    }

    void student2() {
        System.out.println("this is parent class method specific for CollageStudents ");
    }

    void student3() {
        System.out.println("this is parent class method specific for SchoolStudents ");
    }

}

class SyntaxStudent extends Student {
    @Override
    void student2() {
        System.out.println(" collegeStudent overridden method for  SyntaxStudents");
    }

    @Override
    void student3() {
        System.out.println(" SchoolStudents overridden method for  SyntaxStudents");
    }
}

class CollegeStudent extends Student {
    void student1() {
        System.out.println("SyntaxStudents overridden method for CollageStudents ");
    }

    void student3() {
        System.out.println("SchoolStudents overridden method for CollageStudents ");
    }


}

class SchoolStudent extends Student {
    void student1() {
        System.out.println("SyntaxStudents overridden method for SchoolStudents");
    }

    @Override
    void student2() {
        System.out.println("CollageStudents overridden method for SchoolStudents");
    }


}
