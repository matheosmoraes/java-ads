/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] AB = new int[10];
        System.out.println("Informe 10 elementos inteiros:");
        for (int i = 0; i < 10; i++) AB[i] = sc.nextInt();
        int qtd = 0;
        for (int valor : AB) {
            if (valor % 2 != 0) qtd++;
        }
        int[] pares = new int[qtd];
        int pos = 0;
        for (int valor : AB) {
            if (valor % 2 != 0) {
                pares[pos] = valor * 2;
                pos++;
            }
        }
        if (qtd == 0) {
            System.out.println("Não existem elementos ímpares no vetor.");
        } else {
            System.out.println("Vetor de elementos pares gerados:");
            for (int valor : pares) System.out.print(valor + " ");
            System.out.println();
        }

    }
}
