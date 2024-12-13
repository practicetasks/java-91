package t6_classes_and_objects.task_1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.cardNumber = "4400432456867686";
        account.deposit(500, "USD");

        Product product = new Product();
        product.name = "Bike";
        product.price = 120;
        product.currency = "USD";

        // account.buy(product);
        // Был куплен товар 'Bike' за 120 USD

        // Ассоциация


    }
}
