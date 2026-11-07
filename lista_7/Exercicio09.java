// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int espacos = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacos++;
            }
        }
        System.out.println("Quantidade de espacos: " + espacos);
    }
}
