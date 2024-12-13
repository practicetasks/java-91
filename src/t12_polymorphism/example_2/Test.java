package t12_polymorphism.example_2;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(), new Pet(), new WilAnimal(), new Wolf(),
        };
        for (Animal animal : animals) {
            if (animal instanceof Pet) {
                Cat cat = (Cat) animal;
                cat.meow();
            }
            if (animal instanceof WilAnimal) {
                animal.sound();
            }
        }
    }
}
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Pet extends Animal {}
class WilAnimal extends Animal {
    void hunt() {
        System.out.println("Hunt");
    }
}
class Cat extends Pet {
    void meow() {
        System.out.println("Meow");
    }
}
class Wolf extends WilAnimal {}

