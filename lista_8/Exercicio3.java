/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de posições (N <= 20): ");
        int n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("Valor inválido. Informe N entre 1 e 20: ");
            n = sc.nextInt();
        }
        int[] C = new int[n];
        System.out.println("Informe os elementos:");
        for (int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
        }
        System.out.println("Vetor C:");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
        System.out.println();

    }
}
