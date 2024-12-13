package t5_methods.example_2;

public class Test {
    public static void main(String[] args) {
        int[] scores = {10, 10, 8, 9, 5, 5};
        countGoodScores(scores, 8, 10);

        int[] scores2 = {7, 7, 7, 8};
        countGoodScores(scores2, 5, 7);

        int[] nums = {1, 2, 3, 4, 5};
    }

    static void countGoodScores(int[] scores, int min, int max) {
        int count = 0;
        for (int score : scores) {
            if (score >= min && score <= max) {
                count++;
            }
        }
        System.out.println(count);
    }
}

