package t11_non_access_modifiers.example_1;

public class Bird {
    private static int count = 0;

    Bird() {
        count++;
        System.out.println("Количество созданных объектов: " + count);
    }
}
