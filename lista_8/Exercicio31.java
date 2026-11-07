/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de elementos do vetor AM (1 <= N <= 10): ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.print("Valor inválido. Informe N entre 1 e 10: ");
            n = sc.nextInt();
        }
        String[] AM = new String[n];
        System.out.println("Informe as strings:");
        for (int i = 0; i < n; i++) {
            AM[i] = sc.next();
        }
        System.out.println("Vetor AM original:");
        for (String valor : AM) System.out.print(valor + " ");
        System.out.println();
        Arrays.sort(AM);
        System.out.println("Vetor AM ordenado:");
        for (String valor : AM) System.out.print(valor + " ");
        System.out.println();

    }
}
