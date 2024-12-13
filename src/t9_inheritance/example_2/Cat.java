package t9_inheritance.example_2;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        voice();
    }

    @Override
    public void voice() {
        System.out.println("Voice cat " + name);
    }
}
