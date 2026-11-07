/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] PA = new int[5];
        int[] PB = new int[5];
        System.out.println("Informe os 5 elementos de PA:");
        for (int i = 0; i < 5; i++) PA[i] = sc.nextInt();
        System.out.println("Informe os 5 elementos de PB:");
        for (int i = 0; i < 5; i++) PB[i] = sc.nextInt();
        int[] PC = new int[10];
        int pos = 0;
        for (int valor : PA) PC[pos++] = valor;
        for (int valor : PB) PC[pos++] = valor;
        System.out.println("Vetor PA: ");
        for (int valor : PA) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor PB: ");
        for (int valor : PB) System.out.print(valor + " ");
        System.out.println();
        System.out.println("Vetor PC (concatenação): ");
        for (int valor : PC) System.out.print(valor + " ");
        System.out.println();

    }
}
