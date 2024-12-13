package t12_polymorphism.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        List<MediaItem> mediaItems = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            // Считайте команду, введенную пользователем
            int command = Integer.parseInt(scanner.nextLine());

            if (command == 1) {
                System.out.println("Введите название фильма:");
                String title = scanner.nextLine();
                System.out.println("Введите длительность фильма в минутах:");
                int runtime = Integer.parseInt(scanner.nextLine());

                // На основе введенных пользователем значений создайте объект класса Movie
                Movie movie = new Movie(title, runtime);
                mediaItems.add(movie);
            } else if (command == 2) {
                System.out.println("Введите название сериала:");
                String title = scanner.nextLine();
                System.out.println("Введите количество серий:");
                int seriesCount = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите среднюю длительность серии в минутах");
                int runtime = Integer.parseInt(scanner.nextLine());

                // Создайте сериал и добавьте его в список просмотренных
                Series series = new Series(title, runtime, seriesCount);
                mediaItems.add(series);
            } else if (command == 0) {
                printMediaItemsList(mediaItems);

                double totalRuntime = Calculator.calculate(mediaItems);
                System.out.println("Всего вы потратили на просмотр фильмов и сериалов, в днях: " + totalRuntime);
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Добавить фильм");
        System.out.println("2 - Добавить сериал");
        System.out.println("0 - Посчитать суммарное время и выйти");
    }

    public static void printMediaItemsList(List<MediaItem> mediaItems) {
        System.out.println("Вы посмотрели фильмов и сериалов: " + mediaItems.size());
        // Допишите вывод названий всех просмотренных фильмов и сериалов
        for (MediaItem item : mediaItems) {
            System.out.println(item.getTitle());
        }
    }
}

class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double counter = 0;
        for (MediaItem item : mediaItems) {
            if (item instanceof Movie) {
                counter += item.getRuntime();
            } else if (item instanceof Series series) {
                counter += (series.getRuntime() * series.getSeriesCount());
            }
        }
        return counter / 1440;
    }
}

class Series implements MediaItem {

    private final String title;
    private final int averageRuntime;
    private final int seriesCount;

    public Series(String title, int averageRuntime, int seriesCount) {
        this.title = title;
        this.averageRuntime = averageRuntime;
        this.seriesCount = seriesCount;
    }

    @Override
    public int getRuntime() {
        return averageRuntime;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getSeriesCount() {
        return seriesCount;
    }
}

class Movie implements MediaItem {

    private final String title;
    private final int runtime;

    public Movie(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public int getRuntime() {
        return runtime;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

interface MediaItem {
    public int getRuntime();

    public String getTitle();
}
