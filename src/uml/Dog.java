package uml;

public class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing fetch.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
