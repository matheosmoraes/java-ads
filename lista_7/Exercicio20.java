// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();
        int palavras = frase.isEmpty() ? 0 : frase.split("\\s+").length;
        System.out.println("Quantidade de palavras: " + palavras);
    }
}
