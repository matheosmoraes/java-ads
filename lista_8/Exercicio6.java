/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio6 {
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
        System.out.println("Posições em que os elementos são iguais:");
        boolean encontrou = false;
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                System.out.println("Índice " + i + ": " + A[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma posição possui elementos iguais.");
        }

    }
}
