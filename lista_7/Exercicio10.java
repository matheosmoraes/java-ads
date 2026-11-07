// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int maiusculas = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                maiusculas++;
            }
        }
        System.out.println("Quantidade de letras maiusculas: " + maiusculas);
    }
}
