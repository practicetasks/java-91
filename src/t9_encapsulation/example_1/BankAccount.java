package t9_encapsulation.example_1;

public class BankAccount {
    private double amount;
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        user = value;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(int value) {
        if (value > 0) {
            amount += value;
        }
    }

    public void withdraw(int value) {
        if (amount >= value) {
            amount -= value;
        }
    }

//    public void setAmount(double value) {
//        if (value > 0) {
//            amount = value;
//        }
//    }
}
