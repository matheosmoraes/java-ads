/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        sc.nextLine();
        String frase = sc.nextLine();
        String[] palavras = frase.trim().split("\s+");
        String[] AN = new String[palavras.length];
        for (int i = 0; i < palavras.length; i++) {
            AN[i] = palavras[i];
        }
        System.out.println("Vetor AN original:");
        for (String valor : AN) System.out.print(valor + " ");
        System.out.println();
        Arrays.sort(AN);
        System.out.println("Vetor AN ordenado:");
        for (String valor : AN) System.out.print(valor + " ");
        System.out.println();

    }
}
