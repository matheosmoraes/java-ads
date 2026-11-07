/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe N (1 <= N <= 10): ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.print("Valor inválido. Informe N (1 <= N <= 10): ");
            n = sc.nextInt();
        }
        System.out.print("Informe M (1 <= M <= 15): ");
        int m = sc.nextInt();
        while (m < 1 || m > 15) {
            System.out.print("Valor inválido. Informe M (1 <= M <= 15): ");
            m = sc.nextInt();
        }
        int[] P = new int[n];
        int[] Q = new int[m];
        System.out.println("Informe os elementos de P:");
        for (int i = 0; i < n; i++) P[i] = sc.nextInt();
        System.out.println("Informe os elementos de Q:");
        for (int i = 0; i < m; i++) Q[i] = sc.nextInt();
        int[] R = new int[n + m];
        int pos = 0;
        for (int valor : P) R[pos++] = valor;
        for (int valor : Q) R[pos++] = valor;
        System.out.println("Vetor R (concatenação):");
        for (int valor : R) System.out.print(valor + " ");
        System.out.println();

    }
}
