// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio30 {
    private static String rot13(String texto) {
        StringBuilder resultado = new StringBuilder(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere >= 'a' && caractere <= 'z') {
                caractere = (char) ('a' + (caractere - 'a' + 13) % 26);
            } else if (caractere >= 'A' && caractere <= 'Z') {
                caractere = (char) ('A' + (caractere - 'A' + 13) % 26);
            }
            resultado.append(caractere);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.println("3 - Sair");
            System.out.print("Opcao: ");
            String entrada = scanner.nextLine();
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                opcao = 0;
            }
            if (opcao == 1 || opcao == 2) {
                System.out.print("Digite o texto: ");
                System.out.println("Resultado: " + rot13(scanner.nextLine()));
            } else if (opcao != 3) {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}
