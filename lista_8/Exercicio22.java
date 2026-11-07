/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informe a quantidade de elementos (1 <= N <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
        System.out.print("Informe o número máximo permitido para os elementos: ");
        int maximo = sc.nextInt();
        int[] AC = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Informe o elemento " + (i + 1) + ": ");
                AC[i] = sc.nextInt();
                if (AC[i] > maximo) {
                    System.out.println("Valor inválido. Deve ser menor ou igual a " + maximo + ".");
                }
            } while (AC[i] > maximo);
        }
        System.out.println("Vetor AC:");
        for (int valor : AC) System.out.print(valor + " ");
        System.out.println();

    }
}
