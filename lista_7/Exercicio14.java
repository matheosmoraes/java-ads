// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Digite o caractere a substituir: ");
        String entrada = scanner.nextLine();
        if (entrada.isEmpty()) {
            System.out.println("Nenhum caractere foi informado.");
            return;
        }
        char procurado = entrada.charAt(0);
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            resultado += frase.charAt(i) == procurado ? '*' : frase.charAt(i);
        }
        System.out.println(resultado);
    }
}
