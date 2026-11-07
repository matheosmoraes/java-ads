/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AE: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Dimensão inválida. Informe um valor positivo: ");
            n = sc.nextInt();
        }
        int[] AE = new int[n];
        System.out.println("Informe os elementos do vetor AE:");
        for (int i = 0; i < n; i++) AE[i] = sc.nextInt();
        int[] impares = new int[n];
        int qtd = 0;
        for (int valor : AE) {
            if (valor % 2 != 0) {
                impares[qtd] = valor;
                qtd++;
            }
        }
        for (int i = 0; i < qtd; i++) {
            for (int j = i + 1; j < qtd; j++) {
                if (impares[i] < impares[j]) {
                    int aux = impares[i];
                    impares[i] = impares[j];
                    impares[j] = aux;
                }
            }
        }
        System.out.println("Vetor AE com os elementos ímpares em ordem decrescente:");
        for (int i = 0; i < qtd; i++) System.out.print(impares[i] + " ");
        System.out.println();

    }
}
