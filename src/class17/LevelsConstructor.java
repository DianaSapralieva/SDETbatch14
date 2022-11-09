package class17;

public class LevelsConstructor {
    /*
    Write a java class that have 4 constructors with 4 different access levels of
     constructors(private,public,default,protected) and create 4 objects of this class:
     1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
     and observe result.
 */
    int age;
    String name;
    double weight;

    private LevelsConstructor(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("private");
    }

    public LevelsConstructor() {
        System.out.println("public");

    }

    LevelsConstructor(double weight) {
        this.weight = weight;
        System.out.println("default");

    }

    protected LevelsConstructor(String name) {
        this.name = name;
        System.out.println("protected");

    }


    public static void main(String[] args) {
        LevelsConstructor con = new LevelsConstructor(22, "Adam");
        LevelsConstructor con2 = new LevelsConstructor("Lili");
        LevelsConstructor con3 = new LevelsConstructor(2);
        LevelsConstructor con4 = new LevelsConstructor(22.44);
    }
}
