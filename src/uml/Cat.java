package uml;

public class Cat extends Animal implements Pet {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing with a ball of yarn.");
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
