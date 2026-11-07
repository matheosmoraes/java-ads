// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int letras = 0;
        int digitos = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (Character.isLetter(caractere)) {
                letras++;
            } else if (Character.isDigit(caractere)) {
                digitos++;
            }
        }
        System.out.println("Caracteres alfabeticos: " + letras);
        System.out.println("Digitos numericos: " + digitos);
    }
}
