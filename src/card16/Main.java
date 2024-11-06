package card16;

import java.util.Map;

public class Main {
    public static final Map<Character, Integer> TABLE = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {
        String input = "MCMIX";

        assert input.length() >= 1 && input.length() <= 15;

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            assert TABLE.containsKey(currentSymbol);

            int currentNumber = TABLE.get(currentSymbol);
            if (i == input.length() - 1) {
                sum += currentNumber;
            }

            char nextSymbol = input.charAt(i + 1);
            assert TABLE.containsKey(nextSymbol);

            if (currentNumber >= TABLE.get(nextSymbol)) {
                sum += currentNumber;
            } else {
                sum += -currentNumber;
            }
        }

        System.out.printf("%s -> para inteiro -> %d%n", input, sum);
    }
}
