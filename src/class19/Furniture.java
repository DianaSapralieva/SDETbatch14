package class19;

public class Furniture {
    String color = "Green";
}

class Chair extends Furniture {
    String color = "Red";

    void printColor() {
        String color = "Black";
        System.out.println(this.color);  //-> will print Red this key word gives priority to the instance variable
        System.out.println(color);  //color -> will print black-Java gives priority to the local variables
        System.out.println(super.color);//super -> will print Green takes the variable from parent class
    }

}


class TestChair {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}