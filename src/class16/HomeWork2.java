package class16;

public class HomeWork2 {
    /*
    Create a method that will take a String as a parameter and
    returns reversed String. Method should be available to all
    classes within your project and accessible by class name.
     */

    public static String reverseString1(String str) {
        StringBuilder reversed= new StringBuilder(str);
        return reversed.reverse().toString();
    }


    public static void main(String[] args) {
        HomeWork2 obj = new HomeWork2();
        System.out.println(obj.reverseString1("hello"));
    }
}