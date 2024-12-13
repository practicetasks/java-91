package t12_polymorphism.example_4;

public class Test {
    public static void main(String[] args) {
        print(1);
        print("1");
        print(1.2);
        // Статический полиморфизм
        System.out.println();
    }

    static void print(Integer a) {
        System.out.println("Число " + a);
    }

    static void print(String a) {
        System.out.println("Строка " + a);
    }

    static void print(Double a) {
        System.out.println("Дробное число " + a);
    }
}
