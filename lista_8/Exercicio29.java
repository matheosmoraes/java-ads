/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a dimensão do vetor AJ (>=10): ");
        int n = sc.nextInt();
        while (n < 10) {
            System.out.print("Valor inválido. Informe um valor >= 10: ");
            n = sc.nextInt();
        }
        int[] AJ = new int[n];
        int valor;
        for (int i = 0; i < n; i++) {
            do {
                valor = (int) (Math.random() * 1000 + 1);
            } while (existe(AJ, i, valor));
            AJ[i] = valor;
        }
        Arrays.sort(AJ);
        System.out.println("O vetor AJ foi gerado e ordenado. Tente adivinhar um valor em 10 tentativas.");
        for (int tentativa = 1; tentativa <= 10; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": informe um número: ");
            int palpite = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (AJ[i] == palpite) {
                    System.out.println("Você acertou! O valor está na posição " + i + ".");
                    System.out.println("Vetor AJ: ");
                    for (int v : AJ) System.out.print(v + " ");
                    System.out.println();
                    return;
                }
            }
            System.out.println("Não houve acerto nesta tentativa.");
        }
        System.out.println("Suas 10 tentativas acabaram. Fim do jogo.");
        System.out.println("Vetor AJ: ");
        for (int v : AJ) System.out.print(v + " ");
        System.out.println();
    }

    private static boolean existe(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
