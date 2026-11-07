// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toLowerCase(frase.charAt(i)) == 'a') {
                quantidade++;
            }
        }
        System.out.println("Quantidade de letras A: " + quantidade);
    }
}
