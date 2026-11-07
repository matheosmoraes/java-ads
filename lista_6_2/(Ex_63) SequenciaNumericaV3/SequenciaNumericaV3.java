import java.util.Scanner;

public class SequenciaNumericaV3 {
    public static long fibonacci(int n) {
        if (n <= 2) return 1;
        long a = 1, b = 1, fib = 1;
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

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
            long fib = fibonacci(i);
            long prim = primo(i);
            soma += (double) fib / prim;
            System.out.print(fib + "/" + prim + (i == n ? "" : " + "));
        }
        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
