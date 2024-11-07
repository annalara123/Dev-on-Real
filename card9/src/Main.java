import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        List<List<Integer>> combinations = combine(n, k);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        int[] combination = new int[k];

        for (int i = 0; i < k; i++) {
            combination[i] = i + 1;
        }

        while (combination[k - 1] <= n) {
            List<Integer> currentCombination = new ArrayList<>();
            for (int num : combination) {
                currentCombination.add(num);
            }
            result.add(currentCombination);

            int t = k - 1;
            while (t >= 0 && combination[t] == n - k + t + 1) {
                t--;
            }

            if (t < 0) {
                break;
            }

            combination[t]++;

            for (int i = t + 1; i < k; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }

        return result;
    }
}
