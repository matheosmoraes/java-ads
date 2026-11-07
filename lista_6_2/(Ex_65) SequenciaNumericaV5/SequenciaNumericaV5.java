import java.util.Scanner;

public class SequenciaNumericaV5 {
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    // Reutiliza o método primo do Exercicio 63
    public static boolean ePrimo(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static long primo(int n) {
        int count = 0;
        long num = 1;
        while (count < n) {
            num++;
            if (ePrimo(num)) count++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            long fat = fatorial(i - 1); // Fatorial de 0!, 1!, 2!, 3!...
            long prim = primo(i);
            double termo = (double) fat / prim;

            if (i % 2 != 0) {
                soma -= termo;
                System.out.print((i == 1 ? "" : " - ") + fat + "/" + prim);
            } else {
                soma += termo;
                System.out.print(" + " + fat + "/" + prim);
            }
        }
        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
