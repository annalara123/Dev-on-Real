package card5;

public class Main {
    public static void main(String[] args) {
        int[] numero = new int[]{12, 31, 23, 26, 43, 23, 50, 13, 12};

        if (numero.length > 50 || numero.length == 0) {
            throw new IllegalArgumentException("A lista de números deve conter entre 1 e 50 números");
        }

        for (int i : numero) {
            if (i > 50) {
                throw new IllegalArgumentException("");
            }

            if (i % 3 == 2) {
                System.out.println("Adicione 1 a " + i);
            } else {
                System.out.println("Subtraia 1 de " + i);
            }
        }
    }
}