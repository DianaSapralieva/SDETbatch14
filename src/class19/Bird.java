package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    void printInfo() {
        System.out.println(name + " "+color +" "+ age + " " + weight);

    }
}

class Parrot extends Bird {
    Parrot(String name, String color, int age, double weight) {
        super(name, color, age, weight);

    }
}

class Crow extends Bird {
    Crow(String name, String color, int age, double weight) {
        /*this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        super(name, color, age, weight);
    }
    }

    class Test {
        public static void main(String[] args) {
            Parrot parrot= new Parrot("Zeki", "Green", 2, 4);

            parrot.printInfo();
            Crow crow=new Crow("Kiki","black",3,3);
            crow.printInfo();
        }

    }