import java.util.Scanner;

public class SequenciaNumericaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            int num = 2 * i;
            int den = 2 * i - 1;
            double termo = (double) num / den;

            if (i % 2 == 0) {
                soma -= termo;
                System.out.print(" - " + num + "/" + den);
            } else {
                soma += termo;
                System.out.print((i == 1 ? "" : " + ") + num + "/" + den);
            }
        }
        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
