// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();
        if (!frase.isEmpty()) {
            for (String palavra : frase.split("\\s+")) {
                System.out.println(palavra);
            }
        }
    }
}
