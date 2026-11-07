// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        int consoantes = 0;
        String vogais = "aeiouáàâãéêíóôõú";
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (Character.isLetter(caractere) && vogais.indexOf(caractere) < 0) {
                consoantes++;
            }
        }
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
