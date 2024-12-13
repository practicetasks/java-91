package t5_methods.arrays.example_1;

public class Test {
    public static void main(String[] args) {
// TODO Посчитать количество дней с комфортной температурой (от 20 до 25)
        System.out.println("Май 2022");
int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
        comfortCount(may2022);
        avg(may2022);
        findMinMax(may2022);

        System.out.println("\nМай 2023");
comfortCount(may2023);
avg(may2023);
        findMinMax(may2023);
    }

    static void findMinMax(int[] temperatures) {
        int maxTemp = temperatures[0];
        int maxDay = 1;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
                maxDay = i + 1;
            }
        }

        int minTemp = temperatures[0];
        int minDay = 1;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
                minDay = i + 1;
            }
        }

        System.out.println("Самый горячий день " + maxDay + " было " + maxTemp + "˚C");
        System.out.println("Самый холодный день " + minDay + " было " + minTemp + "˚C");
    }

    static void avg(int[] month) {
        double avg = 0;
        for (int i : month) {
            avg += i;
        }
        System.out.println("Средняя температура: " +  avg / month.length);
    }

    static void comfortCount(int[] month) {
        int count = 0;
        for (int temp : month) {
            if (temp >= 20 && temp <= 25) {
                count++;
            }
        }
        System.out.println("Количество дней с комфортной температурой: " + count);
    }
}
