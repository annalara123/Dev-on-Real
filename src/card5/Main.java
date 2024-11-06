package card5;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 31, 23, 26, 43, 23, 50, 13, 12};

        assert numbers.length >= 1 && numbers.length <= 50;

        int operations = 0;
        for (int value : numbers) {
            assert value >= 1 && value <= 50;
            if (value % 3 > 0) {
                operations++;
            }
        }

        System.out.println("Número mínimo de operações: " + operations);
    }
}