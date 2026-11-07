import java.util.Scanner;

public class SequenciaNumericaV4 {
    // Insira os métodos fibonacci(), ePrimo() e primo() aqui igual ao exercício 63.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            long fib = SequenciaNumericaV3.fibonacci(i);
            long prim = SequenciaNumericaV3.primo(i);
            double termo = (double) fib / prim;

            if (i % 2 == 0) {
                soma -= termo;
                System.out.print(" - " + fib + "/" + prim);
            } else {
                soma += termo;
                System.out.print((i == 1 ? "" : " + ") + fib + "/" + prim);
            }
        }
        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
