package t4_arrays.hometasks;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 4. Переставить элементы массива в обратном порядке без использования
        // дополнительного массива: Необходимо изменить порядок элементов в массиве
        // на обратный, не используя другой массив для хранения элементов.

        //   - Пример: Если исходный массив [1, 2, 3, 4, 5], то после перестановки
        //   он будет выглядеть как [5, 4, 3, 2, 1].

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));

    }
}
