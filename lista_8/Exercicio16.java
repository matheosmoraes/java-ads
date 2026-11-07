/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de elementos da sequência de Fibonacci (N <= 20): ");
        int n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("Valor inválido. Informe N entre 1 e 20: ");
            n = sc.nextInt();
        }
        int[] V = new int[n];
        if (n == 1) {
            V[0] = 0;
        } else {
            V[0] = 0;
            V[1] = 1;
            for (int i = 2; i < n; i++) {
                V[i] = V[i - 1] + V[i - 2];
            }
        }
        System.out.println("Sequência de Fibonacci:");
        for (int valor : V) System.out.print(valor + " ");
        System.out.println();

    }
}
