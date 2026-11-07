/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] B = new int[15];
        System.out.println("Informe 15 elementos:");
        for (int i = 0; i < 15; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println("Vetor em ordem invertida:");
        for (int i = B.length - 1; i >= 0; i--) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

    }
}
