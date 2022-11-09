package class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(40);

        int a=23;
        number.add(a);

        System.out.println(number);

        for (Integer num:
                number) {
            System.out.println(num);
        }
    }
}
