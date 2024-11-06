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
        String input = "IX";

        if (input.length() > 15) {
            throw new IllegalArgumentException("Entrada maior que 15 caracteres");
        }

        int sum = 0;
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char symbol = charArray[i];
            char nextSymbol = charArray[i + 1];

            if (!TABLE.containsKey(symbol) || !TABLE.containsKey(nextSymbol)) {
                throw new IllegalArgumentException("Argumento não consta na tabela");
            }

            int number = TABLE.get(symbol);
            int nextNumber = TABLE.get(nextSymbol);

            if (number >= nextNumber) {
                sum += number;
            } else {
                sum -= number;
            }
        }
    }
}
