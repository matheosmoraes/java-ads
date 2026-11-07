import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            int num = 2 * i;
            int den = 2 * i - 1;
            soma += (double) num / den;
            System.out.print(num + "/" + den + (i == n ? "" : " + "));
        }
        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
