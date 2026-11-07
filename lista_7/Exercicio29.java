// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio29 {
    private static char zenitPolar(char caractere) {
        String primeira = "ZENITzenit";
        String segunda = "POLARpolar";
        for (int i = 0; i < primeira.length(); i++) {
            if (caractere == primeira.charAt(i)) {
                return segunda.charAt(i);
            }
            if (caractere == segunda.charAt(i)) {
                return primeira.charAt(i);
            }
        }
        return caractere;
    }

    private static String transformar(String texto) {
        StringBuilder resultado = new StringBuilder(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            resultado.append(zenitPolar(texto.charAt(i)));
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
                System.out.println("Resultado: " + transformar(scanner.nextLine()));
            } else if (opcao != 3) {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}
