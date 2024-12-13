package t10_object.example_2;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        HashMap<Item, Integer> itemsCount = new HashMap<>();
        Item item1 = new Item("Яблоко", 1200);
        Item item2 = new Item("Яблоко", 1200);

        System.out.println(item1.hashCode());
        System.out.println(item2.hashCode());
        itemsCount.put(item1, 150);
        itemsCount.put(item2, 150);
        System.out.println(itemsCount);


        // AB = 65 * 31 + 66 = 2 081
        // BA = 66 * 31 + 65 = 2 111
//        System.out.println("AB".hashCode());
//        System.out.println("BA".hashCode());
    }
}
