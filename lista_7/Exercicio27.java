// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada 1: ");
        String primeira = scanner.nextLine();
        System.out.print("Entrada 2: ");
        String segunda = scanner.nextLine();
        if (primeira.length() != segunda.length()) {
            System.out.println("Erro! Entradas de tamanhos diferentes.");
            return;
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < primeira.length(); i++) {
            resultado.append(primeira.charAt(i)).append(segunda.charAt(i));
        }
        System.out.println("Saida: " + resultado);
    }
}
