package t10_object.example_2;

import java.util.Objects;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        // если ссылки одинаковые
        if (this == o) return true;

        // если был передан null или если у переданного объекта отличается класс
        if (o == null || this.getClass() != o.getClass()) return false;

        // Конвертация в Item класс, чтобы могли достучаться до полей
        Item item = (Item) o;

        // Проверка значении
        return this.price == item.price && Objects.equals(this.name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

