package t3_loops.hometasks;

class SoftwareUpdate {
    public static void main(String[] args) {
        int totalMemory = 2000; // Начальная память устройства
        int updateSize = 300; // Размер первого обновления
        int updateIncrease = 100; // Увеличение размера каждого последующего обновления
        int days = 0; // Дни между обновлениями
        int updatesInstalled = 0; // Количество установленных обновлений

        for (int remainingMemory = totalMemory; remainingMemory >= updateSize; remainingMemory -= updateSize) {
            updatesInstalled++;
            days += 15; // Каждое обновление выходит каждые 15 дней
            System.out.println("На " + days + "-й день установлено обновление " + updatesInstalled + ", осталось " + remainingMemory + " МБ памяти.");

            updateSize += updateIncrease; // Увеличиваем размер следующего обновления
        }

        System.out.println("Всего можно установить " + updatesInstalled + " обновлений.");
    }
}

