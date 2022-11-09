package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        chars.add('F');

        System.out.println(chars);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);

        System.out.println(booleans);

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(12.3f);
        floats.add(44.5f);
        floats.add(55.3f);
        floats.add(12f);
        System.out.println(floats);

    }
}
