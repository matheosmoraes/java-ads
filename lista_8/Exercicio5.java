/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informe a dimensão dos vetores (1 <= n <= 15): ");
            n = sc.nextInt();
        } while (n < 1 || n > 15);
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("Informe os elementos do vetor A:");
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        System.out.println("Informe os elementos do vetor B:");
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();
        int[] soma = new int[n];
        for (int i = 0; i < n; i++) soma[i] = A[i] + B[i];
        System.out.println("Vetor soma:");
        for (int valor : soma) System.out.print(valor + " ");
        System.out.println();

    }
}
