// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia binaria: ");
        String cadeia = scanner.nextLine();
        boolean valida = cadeia.length() == 8;
        for (int i = 0; valida && i < cadeia.length(); i++) {
            char bit = cadeia.charAt(i);
            if (bit != '0' && bit != '1') {
                valida = false;
            }
        }
        System.out.println(valida
                ? "E uma sequencia binaria de 8 bits."
                : "Nao e uma sequencia binaria de 8 bits.");
    }
}
