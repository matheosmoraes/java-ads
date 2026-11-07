/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] AA = new int[10];
        System.out.println("Informe 10 elementos inteiros:");
        for (int i = 0; i < 10; i++) AA[i] = sc.nextInt();
        Arrays.sort(AA);
        int[] resultado = new int[10];
        for (int i = 0; i < 10; i++) {
            resultado[i] = AA[9 - i];
        }
        System.out.println("Vetor AA ordenado em ordem decrescente:");
        for (int valor : resultado) System.out.print(valor + " ");
        System.out.println();

    }
}
