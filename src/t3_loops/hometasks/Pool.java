package t3_loops.hometasks;

public class Pool {
    public static void main(String[] args) {
        int initialWater = 1200; // Начальный объем воды
        int fillRate = 300; // Скорость заполнения
        int evaporationRate = 400; // Испарение каждый час
        int hours = 0;

        for (int waterLevel = initialWater; waterLevel > 0; waterLevel += fillRate - evaporationRate) {
            hours++;
            System.out.println("Час " + hours + ": " + waterLevel + " литров.");
        }

        System.out.println("Вода кончилась через " + hours + " часов.");
    }
}
