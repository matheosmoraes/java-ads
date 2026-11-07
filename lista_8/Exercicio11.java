/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] QA = new int[5];
        int[] QB = new int[5];
        System.out.println("Informe os 5 elementos de QA:");
        for (int i = 0; i < 5; i++) QA[i] = sc.nextInt();
        System.out.println("Informe os 5 elementos de QB:");
        for (int i = 0; i < 5; i++) QB[i] = sc.nextInt();
        int[] QC = new int[10];
        for (int i = 0; i < 5; i++) {
            QC[i * 2] = QA[i];
            QC[i * 2 + 1] = QB[i];
        }
        System.out.println("Vetor QA: ");
        for (int valor : QA) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor QB: ");
        for (int valor : QB) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor QC (intercalação): ");
        for (int valor : QC) System.out.print(valor + " ");
        System.out.println();

    }
}
