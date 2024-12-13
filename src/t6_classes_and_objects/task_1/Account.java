package t6_classes_and_objects.task_1;

public class Account {
    String cardNumber;
    double balance;

    double rateUSD = 450;
    double rateEUR = 500;
    double rateRUB = 5;

    void deposit(int amount, String currency) {
        double converted = convertToKzt(amount, currency);
        balance += converted;
    }

    void withdraw(int amount, String currency) {
        double converted = convertToKzt(amount, currency);

        if (balance >= converted) {
            balance -= converted;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void transfer(Account otherAccount, int amount, String currency) {
        double converted = convertToKzt(amount, currency);

        if (balance >= converted) {
            balance -= converted;
            otherAccount.balance += converted;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void showBalance() {
        System.out.println("Ваш баланс: " + balance);
        System.out.println("Ваш баланс в долларах: " + balance / rateUSD);
        System.out.println("Ваш баланс в евро: " + balance / rateEUR);
        System.out.println("Ваш баланс в рублях: " + balance / rateRUB);
    }

    double convertToKzt(int amount, String currency) {
        return switch (currency) {
            case "USD" -> amount * rateUSD;
            case "EUR" -> amount * rateEUR;
            case "RUB" -> amount * rateRUB;
            default -> amount;
        };
    }
}
