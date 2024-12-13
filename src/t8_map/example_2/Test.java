package t8_map.example_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();

        ArrayList<Double> mojitoPrices = new ArrayList<>();
        mojitoPrices.add(7000.0);
        mojitoPrices.add(15.20);
        mojitoPrices.add(13.20);
        menu.put("Коктейль", mojitoPrices);

        ArrayList<Double> tiramisuPrices = new ArrayList<>();
        tiramisuPrices.add(1800.0);
        tiramisuPrices.add(4.0);
        tiramisuPrices.add(3.20);
        menu.put("Тирамису", tiramisuPrices);

        menu.get("Тирамису").remove(0);

        System.out.println(menu);


        HashMap<String, ArrayList<String>> films = new HashMap<>();

        films.put("Алина", new ArrayList<>() {{
            add("Интерстеллар");
            add("Начало");
            add("Дюна");
        }});

        films.put("Максим", new ArrayList<>() {{
            add("Бойцовский клуб");
            add("Матрица");
            add("Начало");
            add("Властелин колец");
        }});

        films.put("Катя", new ArrayList<>() {{
            add("Амели");
            add("Гордость и предубеждение");
            add("Маленькие женщины");
        }});

// 1. Выведите на экран количество любимых фильмов Максима.
//        System.out.println(films.get("Максим").size());
//
//// 2. Добавьте в список любимых фильмов Кати фильм "Ла-Ла Ленд".
//        System.out.println(films.get("Катя").add("Ла-Ла Ленд"));
//
//// 3. Проверьте, есть ли фильм "Матрица" в списке любимых фильмов Алины.
////    Если есть, выведите на экран "Алина любит Матрицу", иначе выведите "Алина не любит Матрицу".
//        if (films.get("Алина").contains("Матрица")) {
//            System.out.println("Алина любит Матрицу");
//        } else {
//            System.out.println("Алина не любит Матрицу");
//        }
//
//// 4. Удалите фильм "Начало" из списка любимых фильмов Алины.
//        films.get("Алина").remove("Начало");
//
//// 5. Выведите на экран имена всех людей, у которых в списке есть фильм "Дюна".
//        for (String name : films.keySet()) {
//            if (films.get(name).contains("Дюна")) {
//                System.out.println(name);
//            }
//        }

// 6. Проверьте, есть ли у Максима и Алины общий любимый фильм.
//   Выведите "Максим и Алина любят один и тот же фильм: <название фильма>", если такой фильм есть, иначе выведите "У Максима и Алины нет общих любимых фильмов".

//        ArrayList<String> user1 = films.get("Алина");
//        ArrayList<String> user2 = films.get("Максим");
//
//        for (String filmName : user1) {
//            if (user2.contains(filmName)) {
//                System.out.println("Максим и Алина любят один и тот же фильм: " + filmName);
//                return;
//            }
//        }
//        System.out.println("У Максима и Алины нет общих любимых фильмов");

        // страна
        HashMap<String, ArrayList<String>> countries = new HashMap<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        countries.put("", list);

    }
}
