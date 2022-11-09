package class18;

public class Car{
    //Common class has many names like parent class super class base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;

    void printCarDetails(){
        System.out.println("Model "+ model+" Make "+make+" Color "+color);
    }

}
 class BMW extends Car {
//chaild class
    double engineCC;

}

class Tesla extends Car{

}

class Toyota extends Car {

    double engineCC;

}

class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.engineCC=200;
        bmw.printCarDetails();
    }
}
