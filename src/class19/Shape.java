package class19;

public class Shape {
    /*Write program: Shape class has a constructor
     that takes the radius and has a subclass as
     circle class. In circle class create a method
     to calculate the area of circle. Test your code*/
    int radius;
    Shape(int radius){
    }
}
class Circle extends Shape{
    Circle(int radius) {
        super(radius);
        System.out.println("result="+radius*radius*3.14);
    }
}
class test{
    public static void main(String[] args) {

        Circle shape1=new Circle(2);
    }
}
