package class19;

public class Dog extends Animal {

    public Dog(String name, String breed, String color) {
        super(name, breed, color);
    }
}

class Cat extends Animal {

    public Cat(String name, String breed, String color) {
        super(name, breed, color);
    }
}

class testAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Jacky", "German",
                "Black");
        dog.printInfo();
    }

}