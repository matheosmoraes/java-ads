// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        boolean possuiNumero = false;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                possuiNumero = true;
                break;
            }
        }
        System.out.println(possuiNumero
                ? "A frase possui caracteres numericos."
                : "A frase nao possui caracteres numericos.");
    }
}
