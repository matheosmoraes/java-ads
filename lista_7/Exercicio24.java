// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequencia de 0s e 1s: ");
        String cadeia = scanner.nextLine();
        int atual = 0;
        int maior = 0;
        boolean valida = true;
        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.charAt(i) == '1') {
                atual++;
                maior = Math.max(maior, atual);
            } else if (cadeia.charAt(i) == '0') {
                atual = 0;
            } else {
                valida = false;
                break;
            }
        }
        if (valida) {
            System.out.println("Maior sequencia consecutiva de 1: " + maior);
        } else {
            System.out.println("Entrada invalida: use somente 0 e 1.");
        }
    }
}
