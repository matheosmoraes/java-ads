/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informe a quantidade de posições (1 <= N <= 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Quantidade inválida!");
            }
        } while (n < 1 || n > 20);
        int[] D = new int[n];
        System.out.println("Informe os elementos:");
        for (int i = 0; i < n; i++) {
            D[i] = sc.nextInt();
        }
        System.out.println("Vetor D:");
        for (int valor : D) {
            System.out.print(valor + " ");
        }
        System.out.println();

    }
}
