/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] G = new int[5];
        System.out.println("Informe 5 elementos inteiros:");
        for (int i = 0; i < 5; i++) G[i] = sc.nextInt();
        int qtdPares = 0;
        for (int valor : G) {
            if (valor % 2 == 0) qtdPares++;
        }
        if (qtdPares == 0) {
            System.out.println("Não há elementos pares no vetor. Programa encerrado.");
            return;
        }
        int[] H = new int[qtdPares];
        int pos = 0;
        for (int valor : G) {
            if (valor % 2 == 0) {
                H[pos] = valor;
                pos++;
            }
        }
        System.out.println("Vetor H com elementos pares:");
        for (int valor : H) System.out.print(valor + " ");
        System.out.println();

    }
}
