/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] S = new int[10];
        int[] T = new int[15];
        System.out.println("Informe os 10 elementos de S:");
        for (int i = 0; i < 10; i++) S[i] = sc.nextInt();
        System.out.println("Informe os 15 elementos de T:");
        for (int i = 0; i < 15; i++) T[i] = sc.nextInt();
        int[] U = new int[25];
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            U[pos++] = S[i];
            U[pos++] = T[i];
        }
        for (int i = 10; i < 15; i++) U[pos++] = T[i];
        System.out.println("Vetor U (intercalação):");
        for (int valor : U) System.out.print(valor + " ");
        System.out.println();

    }
}
