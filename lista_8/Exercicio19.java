/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] Z = new int[10];
        System.out.println("Informe 10 elementos inteiros:");
        for (int i = 0; i < 10; i++) Z[i] = sc.nextInt();
        Arrays.sort(Z);
        System.out.println("Vetor Z ordenado em ordem crescente:");
        for (int valor : Z) System.out.print(valor + " ");
        System.out.println();

    }
}
