package class26;

import java.util.LinkedHashSet;

public class Task5 {
    public static void main(String[] args) {
        /*Create a Set of cities in which you want to
        make sure that insertion order is maintained.
        Then remove any city that starts with “A”;*/

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Addis Ababa");
        cities.add("Amsterdam");
        cities.add("Baghdad");
        cities.add("Khartoum");
        cities.add("Luxembourg");
        cities.add("Nazran");

       var iterator =cities.iterator();

        while(iterator.hasNext()){
           String item = iterator.next();
            if(item.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
