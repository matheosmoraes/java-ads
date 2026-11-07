/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AF: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Dimensão inválida. Informe um valor positivo: ");
            n = sc.nextInt();
        }
        int[] AF = new int[n];
        System.out.println("Informe os elementos do vetor AF:");
        for (int i = 0; i < n; i++) AF[i] = sc.nextInt();
        int[] impares = new int[n];
        int[] pares = new int[n];
        int qtdImpar = 0, qtdPar = 0;
        for (int valor : AF) {
            if (valor % 2 == 0) {
                pares[qtdPar++] = valor;
            } else {
                impares[qtdImpar++] = valor;
            }
        }
        Arrays.sort(impares, 0, qtdImpar);
        for (int i = 0; i < qtdPar; i++) {
            for (int j = i + 1; j < qtdPar; j++) {
                if (pares[i] < pares[j]) {
                    int aux = pares[i];
                    pares[i] = pares[j];
                    pares[j] = aux;
                }
            }
        }
        System.out.println("Vetor AF ordenado: ");
        for (int i = 0; i < qtdImpar; i++) System.out.print(impares[i] + " ");
        for (int i = 0; i < qtdPar; i++) System.out.print(pares[i] + " ");
        System.out.println();

    }
}
