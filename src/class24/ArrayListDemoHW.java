package class24;

import java.util.ArrayList;

public class ArrayListDemoHW {
    public static void main(String[] args) {

        /*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/




        ArrayList<String> names=new ArrayList<>(5);
        names.add("Yasmina");
        names.add("Sean");
        names.add("Nina");
        names.add("PHILIPPE");
        names.add("Adam");
        System.out.println(names.isEmpty()); //given ArrayList is empty or not?
        System.out.println(names.contains("Jam"));//name is present in an ArrayList or not?
        System.out.println(names.contains("Adam"));//name is present in an ArrayList or not?
        System.out.println(names.size());//size of your arrayList
        System.out.println(names);//print all values

    }


}
