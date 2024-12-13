package t6_classes_and_objects.example_1;

public class Hamster {
    // Поля fields
    String name;  // null
    int age;      // 0
    int weight;   // 0
    String color; // null

    // Методы methods
    void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Цвет: " + color);
    }

    void eat() {
        System.out.println("Хомяк " + name + " кушает...");
        weight += 5;
    }
}
