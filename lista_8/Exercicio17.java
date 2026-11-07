/* Nome do aluno: [Seu Nome Completo] */
import java.util.*;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de elementos da sequência de primos (N <= 20): ");
        int n = sc.nextInt();
        while (n < 1 || n > 20) {
            System.out.print("Valor inválido. Informe N entre 1 e 20: ");
            n = sc.nextInt();
        }
        int[] X = new int[n];
        int numero = 2;
        int pos = 0;
        while (pos < n) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                X[pos] = numero;
                pos++;
            }
            numero++;
        }
        System.out.println("Sequência de primos:");
        for (int valor : X) System.out.print(valor + " ");
        System.out.println();

    }
}
