package class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Tommy", "Black","German"));
        dogs.add(new Dog("Duke", "Brown","Breed"));
        dogs.add(new Dog("Billie", "White","Bulldog"));

        System.out.println(dogs.toString());

    }
}
