package class26;

import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add
        names of the countries. In this set we want all objects
        to be sorted in alphabetical order. Using 2 different
        ways retrieve all elements from set.*/

        TreeSet<String> countries=new TreeSet<>();

        countries.add("Germany");
        countries.add("Luxembourg");
        countries.add("Russia");
        countries.add("Spain");
        countries.add("Iraq");

        var iterator = countries.iterator();

        //first way to retrieve
        while(iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country);
        }
        //second way to retrieve
        for(String country:countries){
            System.out.println(country);
        }
    }
}
