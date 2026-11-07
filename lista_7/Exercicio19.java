// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String normalizada = palavra.toLowerCase();
        boolean palindromo = true;
        for (int esquerda = 0, direita = normalizada.length() - 1;
             esquerda < direita; esquerda++, direita--) {
            if (normalizada.charAt(esquerda) != normalizada.charAt(direita)) {
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo ? "E palindromo." : "Nao e palindromo.");
    }
}
