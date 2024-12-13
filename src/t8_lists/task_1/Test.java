package t8_lists.task_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> radiohead = new ArrayList<>(List.of(1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016));

        // TODO: создайте метод, который возвращает года выпуска альбомов, если они относятся к 21 веку
        //  Ожидаемый результат: [2001, 2003, 2007, 2011, 2016]

        ArrayList<Integer> result = getTwentyFirstCenturyAlbums(radiohead);
        System.out.println(result);

        // Классы обёртки - ?
        // null
    }

    static ArrayList<Integer> getTwentyFirstCenturyAlbums(ArrayList<Integer> albums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer year : albums) {
            if (year > 2000) {
                result.add(year);
            }
        }
        return result;
    }
}
