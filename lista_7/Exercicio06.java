// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Digite o caractere a contar: ");
        String entrada = scanner.nextLine();
        if (entrada.isEmpty()) {
            System.out.println("Nenhum caractere foi informado.");
            return;
        }
        char procurado = Character.toLowerCase(entrada.charAt(0));
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.toLowerCase(frase.charAt(i)) == procurado) {
                quantidade++;
            }
        }
        System.out.println("Quantidade: " + quantidade);
    }
}
