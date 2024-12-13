package t6_classes_and_objects.example_1;

public class Main {
    public static void main(String[] args) {
        Hamster hamster = new Hamster();
        hamster.name = "Байт";
        hamster.weight = 350;

        Hamster hamster1 = new Hamster();
        hamster1.eat();
        hamster1.eat();
        System.out.println(hamster1.weight);

        System.out.println(hamster.weight);
    }
}
