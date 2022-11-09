package class20;

public class task1 {
    /*Create 1 class in which create a methods that
    will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code*/



    static void add1(int num1) {
        System.out.println("Square: "+num1 *2);
    }

    static void add1(int h, int l,int w ) {
        System.out.println("Box:" +(h * l*w));
    }

    static void add1(double l, double w) {
        System.out.println("Rectangle:"+l*w);
    }
}
class separate{
    public static void main(String[] args) {
        task1 square=new task1();
        square.add1(44);
        task1 box=new task1();
        box.add1(44,22,44);
        task1 rectangle=new task1();
        rectangle.add1(44,55);

    }
}
