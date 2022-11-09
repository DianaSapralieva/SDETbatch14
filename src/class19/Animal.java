package class19;

public class Animal {
    String name;
    String breed;
    String color;
   Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public void printInfo() {
        System.out.println(name + " " + color + " " + color);

    }
}
