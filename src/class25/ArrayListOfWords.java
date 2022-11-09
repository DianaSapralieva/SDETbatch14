package class25;

import java.util.ArrayList;

public class ArrayListOfWords {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> words = new ArrayList<>();
        words.add("array");
        words.add("Base");
        words.add("words");

       // Iterator<String> iterator = words.iterator();
        var iterator=words.iterator();

        //Remove every word that ends with “e”
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
