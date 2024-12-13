package t9_inheritance.example_2;

public class Animal {
    protected String name;

    public Animal(String name) {
        voice();
        this.name = name;
    }

    protected void voice() {
        System.out.println("Voice animal " + name);
    }
}
