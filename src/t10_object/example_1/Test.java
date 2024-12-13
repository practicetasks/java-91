package t10_object.example_1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Автоупаковка
        // java.lang
        Object a = 23;
        a = "";
        a = new int[1];
        a = new ArrayList<>();

        test(123);
        test("123");
        test(true);

        var b = 23;
        System.out.println(b + 23);

    }


    public static String get() {
        return "";
    }

    public static void test(Object a) {

    }
}
