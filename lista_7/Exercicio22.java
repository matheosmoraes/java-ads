// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        System.out.print("Digite a palavra a procurar: ");
        String palavra = scanner.nextLine().toLowerCase();
        if (palavra.isEmpty()) {
            System.out.println("A palavra nao pode ser vazia.");
            return;
        }
        int quantidade = 0;
        for (int inicio = 0; inicio <= frase.length() - palavra.length(); inicio++) {
            if (frase.startsWith(palavra, inicio)) {
                quantidade++;
            }
        }
        System.out.println("A palavra ocorre " + quantidade + " vez(es).");
    }
}
