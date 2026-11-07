/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio15 {
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
        int[] S = new int[n];
        int[] T = new int[m];
        System.out.println("Informe os elementos de S:");
        for (int i = 0; i < n; i++) S[i] = sc.nextInt();
        System.out.println("Informe os elementos de T:");
        for (int i = 0; i < m; i++) T[i] = sc.nextInt();
        int[] U = new int[n + m];
        int pos = 0;
        for (int i = 0; i < Math.max(n, m); i++) {
            if (i < n) U[pos++] = S[i];
            if (i < m) U[pos++] = T[i];
        }
        System.out.println("Vetor U (intercalação):");
        for (int valor : U) System.out.print(valor + " ");
        System.out.println();

    }
}
