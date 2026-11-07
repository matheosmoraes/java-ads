/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de elementos do vetor AK: ");
        int n = sc.nextInt();
        while (n < 2) {
            System.out.print("Quantidade inválida. Informe um valor >= 2: ");
            n = sc.nextInt();
        }
        double[] AK = new double[n];
        System.out.println("Informe os elementos de AK:");
        for (int i = 0; i < n; i++) {
            AK[i] = sc.nextDouble();
        }
        Arrays.sort(AK);
        System.out.println("Vetor AK ordenado:");
        for (double valor : AK) System.out.print(valor + " ");
        System.out.println();
        double[] AL = new double[(n * 2) - 1];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            AL[pos++] = AK[i];
            if (i < n - 1) {
                AL[pos++] = (AK[i] + AK[i + 1]) / 2.0;
            }
        }
        System.out.println("Vetor AL com as médias entre cada par de elementos:");
        for (double valor : AL) System.out.print(valor + " ");
        System.out.println();

    }
}
