package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfDrinks {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has
        // letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("cola");
        drinks.add("fanta");
        drinks.add("orange juice");
        drinks.add("apple juice");
        drinks.add("drink");

        Iterator<String> iterator=drinks.iterator();

        while(iterator.hasNext()){
            String drink= iterator.next();
            if(drink.contains("a")||drink.contains("e")){
                System.out.println("water");
            }else{
                System.out.println(drink);
            }
        }
    }
}
