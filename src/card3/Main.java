package card3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = arr.length;

        assert length >= 1 && length <= 1000;

        int[] result = new int[length * 2];
        for (int i = 0; i < length; i++) {
            int number = arr[i];

            assert number >= 1 && number <= 1000;

            result[i] = number;
            result[i + length] = number;
        }

        System.out.println("Entrada: " + Arrays.toString(arr));
        System.out.println("Saída: " + Arrays.toString(result));
    }
}
