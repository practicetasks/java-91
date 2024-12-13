package t3_loops.hometasks;

public class Practice {
    public static void main(String[] args) {
        int money = 2500; // Деньги на корм
        int foodPerDay = 500; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм

        for (int i = money - foodPerDay; i >= 0; i = i - foodPerDay){
            days += 3;
            System.out.println("На " + days + "-й день останется " + i + " тенге.");
        } // Цикл оканчивается здесь

        System.out.println("Денег хватит на " + days + " дней.");
    }
}
