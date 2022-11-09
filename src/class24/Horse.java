package class24;

public class Horse {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Negative weight is not allowed. Please try again");
        } else if (weight > 300) {
            System.out.println("Please try less than 300 ");
        } else {
            this.weight = weight;
        }
    }
    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Color "+color+ " Age " + age + " Weight " + weight);
    }
}
    class TestHorse{
        public static void main(String[] args) {
            Horse horse=new Horse("Spirit","jkj","brown",22,150);

            horse.printInfo();
        }
    }
