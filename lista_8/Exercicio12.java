/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] P = new int[10];
        int[] Q = new int[15];
        System.out.println("Informe os 10 elementos de P:");
        for (int i = 0; i < 10; i++) P[i] = sc.nextInt();
        System.out.println("Informe os 15 elementos de Q:");
        for (int i = 0; i < 15; i++) Q[i] = sc.nextInt();
        int[] R = new int[25];
        int pos = 0;
        for (int valor : P) R[pos++] = valor;
        for (int valor : Q) R[pos++] = valor;
        System.out.println("Vetor P:");
        for (int valor : P) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor Q:");
        for (int valor : Q) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor R (concatenação):");
        for (int valor : R) System.out.print(valor + " ");
        System.out.println();

    }
}
