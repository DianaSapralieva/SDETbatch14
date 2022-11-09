package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeliner");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("conditioner");
        cosmetics.add("lotion");

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("lotion");
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);


    }
}