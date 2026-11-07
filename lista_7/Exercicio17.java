// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira frase: ");
        String primeira = scanner.nextLine();
        System.out.print("Digite a segunda frase: ");
        String segunda = scanner.nextLine();
        boolean iguais = primeira.length() == segunda.length();
        for (int i = 0; iguais && i < primeira.length(); i++) {
            if (primeira.charAt(i) != segunda.charAt(i)) {
                iguais = false;
            }
        }
        System.out.println(iguais ? "As frases sao iguais." : "As frases sao diferentes.");
    }
}
