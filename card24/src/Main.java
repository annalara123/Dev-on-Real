public class Main {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;

        if (n < 1 || m > 1000) {
            throw new IllegalArgumentException("O valor de n deve ser maior que 0 e m menor ou igual a 1000");
        }

        int[] sumNumbers = addIndivisibleAndDivisibleNumbersInARange(n, m);
        int calculateDifference = sumNumbers [0] - sumNumbers[1];

        System.out.println(calculateDifference);
    }

    public static int[] addIndivisibleAndDivisibleNumbersInARange(int finalRangeNumber, int divisionNumber) {
        int sumIndivisibleNumbers = 0;
        int sumDivisibleNumbers = 0;

        for (int i = 1; i <= finalRangeNumber; i++) {
            if (i % divisionNumber != 0)
                sumIndivisibleNumbers += i;
            else
                sumDivisibleNumbers += i;
        }

        return new int[]{sumIndivisibleNumbers, sumDivisibleNumbers};
    }
}