// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        boolean todasMaiusculas = true;
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (Character.isLetter(caractere) && !Character.isUpperCase(caractere)) {
                todasMaiusculas = false;
                break;
            }
        }
        System.out.println(todasMaiusculas
                ? "Todos os caracteres alfabeticos sao maiusculos."
                : "Nem todos os caracteres alfabeticos sao maiusculos.");
    }
}
