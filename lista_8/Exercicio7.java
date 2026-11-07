/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Informe o tamanho do vetor (1 <= N <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
        int[] E = new int[n];
        System.out.println("Informe os elementos:");
        for (int i = 0; i < n; i++) E[i] = sc.nextInt();
        int maior = E[0];
        int menor = E[0];
        for (int i = 1; i < n; i++) {
            if (E[i] > maior) maior = E[i];
            if (E[i] < menor) menor = E[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
