package t3_loops.max_example;

public class Test {
    public static void main(String[] args) {
        int[] nums = {60, 20, 45, 155, 32};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
    }
}
