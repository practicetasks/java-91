package t11_enums.example_2;

// Пример с enum
public class Main {
    public static void main(String[] args) {
//        Event event = new Event("", Season.WINTER);
        int index = Season.FALL.ordinal();
        System.out.println(index);

    }
}
