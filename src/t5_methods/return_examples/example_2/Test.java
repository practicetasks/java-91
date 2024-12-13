package t5_methods.return_examples.example_2;

public class Test {
    public static void main(String[] args) {
        String category = "Наушники";
        int price = 249_990;
        double result = calculateDiscount(category, price);
        System.out.println(result);


    }

    // Если Ноутбуки - 15%
    // Если Смартфоны - 10%
    // Если Наушники - 15%
    static double calculateDiscount(String category, int price) {
        double result =  switch (category) {
            case "Ноутбуки", "Наушники" -> price * 0.85;
            case "Смартфоны" -> price * 0.9;
            default -> price;
        };

        return result;
    }
}
