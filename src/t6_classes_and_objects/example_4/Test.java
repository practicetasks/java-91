package t6_classes_and_objects.example_4;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Кот", 2500);
        System.out.println(animal.type);
        System.out.println(animal.weight);
    }
}

class Animal {
    String type;
    int weight;

    Animal(String newType, int newWeight) {
        type = newType;
        weight = newWeight;
    }
}
