package class17;

public class HomeWork1005 {
    /*
    Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    String name;
    int age;

    public HomeWork1005(String MyName, int MyAge) {
        name = MyName;
        age =MyAge;
        System.out.println(name+" "+age+" y.o.");
    }

   public HomeWork1005() {
    }


}
