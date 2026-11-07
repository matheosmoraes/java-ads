// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Nenhum nome foi informado.");
            return;
        }
        String[] partes = nome.split("\\s+");
        System.out.println("Sobrenome: " + partes[partes.length - 1]);
    }
}
