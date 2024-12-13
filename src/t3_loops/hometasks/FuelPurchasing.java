package t3_loops.hometasks;

public class FuelPurchasing {
    public static void main(String[] args) {
        int money = 10000; // Начальная сумма денег
        int fuelPrice = 150; // Стоимость 1 литра топлива
        int fuelPerTrip = 20; // Литры, необходимые для одной поездки
        int days = 0; // Счётчик дней
        int trips = 0; // Количество возможных поездок

        for (int remainingMoney = money; remainingMoney >= fuelPrice * fuelPerTrip; remainingMoney -= fuelPrice * fuelPerTrip) {
            days += 5; // Каждый цикл представляет собой 5 дней
            trips++; // Совершена ещё одна поездка
            System.out.println("На " + days + "-й день осталось " + remainingMoney + " тенге после поездки " + trips + ".");

            fuelPrice += 20; // Увеличение цены топлива каждые 5 дней
        }

        System.out.println("Всего можно совершить " + trips + " поездок.");
    }
}
