package t11_enums.example_2;

public enum Season {
    WINTER("Зима"),  // 0/WINTER
    SPRING("Весна"), // 1/SPRING
    SUMMER("Лето"),  // 2
    FALL("Осень");   // 3

    private final String rusName;

    Season(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
