package t11_enums.example_1;


// Пример БЕЗ enum
public class Season {
    public static final Season WINTER = new Season("Winter", "Зима");
    public static final Season SUMMER = new Season("Summer", "Лето");
    public static final Season FALL = new Season("Fall", "Осень");
    public static final Season SPRING = new Season("Spring", "Весна");

    private final String name;
    private final String rusName;

    private Season(String name, String rusName) {
        this.name = name;
        this.rusName = rusName;
    }

    public String getName() {
        return name;
    }

    public String getRusName() {
        return rusName;
    }
}
