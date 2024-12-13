package t5_methods.example_1;

public class Test {
    public static void main(String[] args) {
        sayHello("Дамир", "К");
        sayHello("Алексей", "Д");
    }

    public static void sayHello(String name, String lastname) {
        System.out.println("Привет " + name + " " + lastname);
    }
}
