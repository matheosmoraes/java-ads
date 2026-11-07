// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        String vogais = "aeiou";
        int[] quantidades = new int[vogais.length()];
        for (int i = 0; i < frase.length(); i++) {
            char caractere = Character.toLowerCase(frase.charAt(i));
            int indice = vogais.indexOf(caractere);
            if (indice < 0) {
                switch (caractere) {
                    case 'á': case 'à': case 'â': case 'ã': indice = 0; break;
                    case 'é': case 'ê': indice = 1; break;
                    case 'í': indice = 2; break;
                    case 'ó': case 'ô': case 'õ': indice = 3; break;
                    case 'ú': indice = 4; break;
                    default: break;
                }
            }
            if (indice >= 0) {
                quantidades[indice]++;
            }
        }
        for (int i = 0; i < vogais.length(); i++) {
            System.out.println(vogais.charAt(i) + ": " + quantidades[i]);
        }
    }
}
