// Nome completo: preencher aqui.
import java.util.Scanner;

public class Exercicio25 {
    private static boolean simboloPermitido(char caractere) {
        return "!@#$%&*()+".indexOf(caractere) >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean aprovada = false;
        while (!aprovada) {
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            int letras = 0;
            int digitos = 0;
            int simbolos = 0;
            boolean maiuscula = false;
            boolean minuscula = false;
            for (int i = 0; i < senha.length(); i++) {
                char caractere = senha.charAt(i);
                if (Character.isLetter(caractere)) {
                    letras++;
                    maiuscula |= Character.isUpperCase(caractere);
                    minuscula |= Character.isLowerCase(caractere);
                } else if (Character.isDigit(caractere)) {
                    digitos++;
                } else if (simboloPermitido(caractere)) {
                    simbolos++;
                }
            }
            boolean tamanhoOk = senha.length() >= 10;
            boolean letrasOk = letras >= 3 && maiuscula && minuscula;
            boolean digitosOk = digitos >= 3;
            boolean simbolosOk = simbolos >= 2;
            System.out.println("Regras");
            System.out.println("Tamanho minimo 10: " + senha.length()
                    + (tamanhoOk ? " (ok)" : " (x)"));
            System.out.println("Letras (3, incluindo maiuscula e minuscula): " + letras
                    + (letrasOk ? " (ok)" : " (x)"));
            System.out.println("Numeros (3): " + digitos + (digitosOk ? " (ok)" : " (x)"));
            System.out.println("Simbolos permitidos (2): " + simbolos
                    + (simbolosOk ? " (ok)" : " (x)"));
            aprovada = tamanhoOk && letrasOk && digitosOk && simbolosOk;
            System.out.println(aprovada
                    ? "Senha aprovada! Parabens!"
                    : "Senha reprovada! Tente novamente.");
        }
    }
}
