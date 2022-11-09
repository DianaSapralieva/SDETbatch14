package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Tymur");
        names.add("Sean");
        names.add("John");
        names.add(2, "Asghar");

        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(33);
        numbers.add(1033);
        numbers.add(1, 666);
        System.out.println(numbers);
        numbers.clear();//deletes all the elements from the list
        System.out.println(numbers);
    }
}
