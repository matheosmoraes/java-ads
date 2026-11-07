/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AG: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.print("Dimensão inválida. Informe um valor positivo: ");
            n = sc.nextInt();
        }
        int[] AG = new int[n];
        System.out.println("Informe os elementos do vetor AG:");
        for (int i = 0; i < n; i++) AG[i] = sc.nextInt();
        int[] primos = new int[n];
        int qtd = 0;
        for (int valor : AG) {
            if (valor >= 2) {
                boolean ePrimo = true;
                for (int i = 2; i <= Math.sqrt(valor); i++) {
                    if (valor % i == 0) {
                        ePrimo = false;
                        break;
                    }
                }
                if (ePrimo) {
                    primos[qtd++] = valor;
                }
            }
        }
        Arrays.sort(primos, 0, qtd);
        System.out.println("Vetor AG com os elementos primos em ordem crescente:");
        for (int i = 0; i < qtd; i++) System.out.print(primos[i] + " ");
        System.out.println();

    }
}
