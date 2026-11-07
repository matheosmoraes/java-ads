/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AH (>=25): ");
        int n = sc.nextInt();
        while (n < 25) {
            System.out.print("Dimensão inválida. Informe um valor >= 25: ");
            n = sc.nextInt();
        }
        int[] AH = new int[n];
        System.out.println("Informe os elementos do vetor AH:");
        for (int i = 0; i < n; i++) AH[i] = sc.nextInt();
        int tamAI;
        do {
            System.out.print("Informe o tamanho do vetor AI (2 <= N <= 5): ");
            tamAI = sc.nextInt();
        } while (tamAI < 2 || tamAI > 5);
        int[] AI = new int[tamAI];
        System.out.println("Informe os elementos do vetor AI:");
        for (int i = 0; i < tamAI; i++) AI[i] = sc.nextInt();
        boolean contido = false;
        for (int i = 0; i <= n - tamAI; i++) {
            boolean igual = true;
            for (int j = 0; j < tamAI; j++) {
                if (AH[i + j] != AI[j]) {
                    igual = false;
                    break;
                }
            }
            if (igual) {
                contido = true;
                System.out.println("O vetor AI está contido em AH na posição inicial " + i + ".");
                break;
            }
        }
        if (!contido) {
            System.out.println("Erro: o vetor AI não está contido no vetor AH.");
        }

    }
}
