package t12_polymorphism.example_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("first"));
        items.add(new Item("second"));

        Item item = new Item("first");
        System.out.println(items.contains(item));
    }
}

class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object == null || object.getClass() != this.getClass()) return false;
        Item item = (Item) object;
        return Objects.equals(this.name, item.name);
    }
}