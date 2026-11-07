// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        StringBuilder resultado = new StringBuilder(frase.length());
        int esquerda = 0;
        int direita = frase.length() - 1;
        while (esquerda <= direita) {
            resultado.append(frase.charAt(esquerda++));
            if (esquerda <= direita) {
                resultado.append(frase.charAt(direita--));
            }
        }
        System.out.println("Resultado: " + resultado);
    }
}
