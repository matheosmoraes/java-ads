/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AD: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Dimensão inválida. Informe um valor positivo: ");
            n = sc.nextInt();
        }
        int[] AD = new int[n];
        System.out.println("Informe os elementos do vetor AD:");
        for (int i = 0; i < n; i++) AD[i] = sc.nextInt();
        int[] pares = new int[n];
        int qtd = 0;
        for (int valor : AD) {
            if (valor % 2 == 0) {
                pares[qtd] = valor;
                qtd++;
            }
        }
        Arrays.sort(pares, 0, qtd);
        System.out.println("Vetor AD com os elementos pares em ordem crescente:");
        for (int i = 0; i < qtd; i++) System.out.print(pares[i] + " ");
        System.out.println();

    }
}
