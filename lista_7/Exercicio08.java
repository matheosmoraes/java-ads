// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int quantidade = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == letra) {
                    quantidade++;
                }
            }
            if (quantidade > 0) {
                System.out.println(letra + ": " + quantidade);
            }
        }
    }
}
