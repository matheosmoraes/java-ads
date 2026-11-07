/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de elementos da sequência de fatoriais (N <= 15): ");
        int n = sc.nextInt();
        while (n < 1 || n > 15) {
            System.out.print("Valor inválido. Informe N entre 1 e 15: ");
            n = sc.nextInt();
        }
        int[] Y = new int[n];
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            Y[i - 1] = fatorial;
        }
        System.out.println("Sequência de fatoriais:");
        for (int valor : Y) System.out.print(valor + " ");
        System.out.println();

    }
}
