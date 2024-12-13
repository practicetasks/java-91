package t5_methods.return_examples.example_1;

public class Test {
    public static void main(String[] args) {
//        int result = sum(5, 6);
//        System.out.println(result);
//        System.out.println(sum(result, 2));

//        int result = divide(12, 0);
//        System.out.println(result);

//        int a = 6;
//        int b = 3;
//        int max = max(a, max(max(5,6), b));
//        System.out.println(max);

        max(5 + 5, 1 + 1 + 1 + 1 + 1 + 1);
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        } else {
            return a / b;
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
