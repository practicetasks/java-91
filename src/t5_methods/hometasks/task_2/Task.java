package t5_methods.hometasks.task_2;

public class Task {
    public static void main(String[] args) {
        calculateDiscount(549_990, "Ноутбуки");
        calculateDiscount(189_990, "Наушники");
        calculateDiscount(449_990, "Смартфоны");
        calculateDiscount(129_990, "Мебель");
    }

    static void calculateDiscount(double price, String category) {
        switch (category) {
            case "Ноутбуки", "Наушники" ->
                    System.out.println("С учетом 15% скидки сумма составляет: " + price * 0.85);
            case "Смартфоны" ->
                    System.out.println("С учетом 10% скидки сумма составляет: " + price * 0.9);
            default ->
                    System.out.println("Скидка недоступна для категории: " + category + ". Сумма к оплате: " + price);

        }
    }
}
