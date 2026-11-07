/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] F = new int[5];
        System.out.println("Informe 5 elementos inteiros:");
        for (int i = 0; i < 5; i++) F[i] = sc.nextInt();
        int soma = 0;
        boolean temImpar = false;
        for (int valor : F) {
            if (valor % 2 != 0) {
                soma += valor;
                temImpar = true;
            }
        }
        if (!temImpar) {
            System.out.println("Não existe elemento ímpar no vetor.");
        } else {
            System.out.println("Soma dos elementos ímpares: " + soma);
        }

    }
}
