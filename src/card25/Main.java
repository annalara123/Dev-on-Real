package card25;

import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbbAA";

        assert jewels.length() >= 1 && jewels.length() <= 50;
        assert stones.length() >= 1 && stones.length() <= 50;

        Set<Character> jewelsSet = jewels
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toUnmodifiableSet());

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelsSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        System.out.printf("Jóias: %s, Pedras: %s%n", jewels, stones);
        System.out.printf("Quantidade de jóias: %d%n", count);
    }
}
