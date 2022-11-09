package class18;

public class horse extends Animal {


    double weight;

    public horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }



    public static void main(String[] args) {
        horse horseObj = new horse("Spirit", "Stallion", 22, 400);
        horseObj.printInfo();

    }
}
