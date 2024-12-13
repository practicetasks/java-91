package t3_loops.hometasks;

public class Savings {
    public static void main(String[] args) {
        int startAmount = 1000; // Начальная сумма
        int monthlyIncrease = 200; // Ежемесячное увеличение

        for (int month = 1; month <= 12; month++) {
            startAmount += monthlyIncrease;
            System.out.println("Месяц " + month + ": " + startAmount + " тенге.");
        }
    }
}
