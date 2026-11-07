/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        System.out.println("Informe 15 elementos:");
        for (int i = 0; i < 15; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Vetor A:");
        for (int valor : A) {
            System.out.print(valor + " ");
        }
        System.out.println();

    }
}
