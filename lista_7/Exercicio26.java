// Nome completo: preencher aqui.
import java.util.Random;

public class Exercicio26 {
    private static String maiorSequenciaRepetida(String texto) {
        int inicioMelhor = 0;
        int tamanhoMelhor = 0;
        int inicio = 0;
        while (inicio < texto.length()) {
            int fim = inicio + 1;
            while (fim < texto.length() && texto.charAt(fim) == texto.charAt(inicio)) {
                fim++;
            }
            if (fim - inicio > tamanhoMelhor) {
                inicioMelhor = inicio;
                tamanhoMelhor = fim - inicio;
            }
            inicio = fim;
        }
        return texto.substring(inicioMelhor, inicioMelhor + tamanhoMelhor);
    }

    private static String maiorSequenciaVogal(String texto) {
        int inicioMelhor = 0;
        int tamanhoMelhor = 0;
        int inicio = -1;
        for (int i = 0; i <= texto.length(); i++) {
            boolean vogal = i < texto.length() && "aeiou".indexOf(texto.charAt(i)) >= 0;
            if (vogal && inicio < 0) {
                inicio = i;
            } else if (!vogal && inicio >= 0) {
                if (i - inicio > tamanhoMelhor) {
                    inicioMelhor = inicio;
                    tamanhoMelhor = i - inicio;
                }
                inicio = -1;
            }
        }
        return texto.substring(inicioMelhor, inicioMelhor + tamanhoMelhor);
    }

    private static String maiorSequenciaAlfabetica(String texto) {
        int inicioMelhor = 0;
        int tamanhoMelhor = 1;
        int inicio = 0;
        for (int i = 1; i <= texto.length(); i++) {
            if (i < texto.length() && texto.charAt(i) == texto.charAt(i - 1) + 1) {
                continue;
            }
            if (i - inicio > tamanhoMelhor) {
                inicioMelhor = inicio;
                tamanhoMelhor = i - inicio;
            }
            inicio = i;
        }
        return texto.substring(inicioMelhor, inicioMelhor + tamanhoMelhor);
    }

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder texto = new StringBuilder(100);
        boolean[] presentes = new boolean[26];
        for (int i = 0; i < 100; i++) {
            char letra = (char) ('a' + random.nextInt(26));
            texto.append(letra);
            presentes[letra - 'a'] = true;
        }
        System.out.println("String gerada: " + texto);
        StringBuilder ausentes = new StringBuilder();
        for (int i = 0; i < presentes.length; i++) {
            if (!presentes[i]) {
                ausentes.append((char) ('a' + i)).append(' ');
            }
        }
        System.out.println(ausentes.length() == 0
                ? "Letras ausentes: nenhuma"
                : "Letras ausentes: " + ausentes.toString().trim());
        System.out.println("Maior sequencia de letras repetidas: "
                + maiorSequenciaRepetida(texto.toString()));
        System.out.println("Maior sequencia de vogais: "
                + maiorSequenciaVogal(texto.toString()));
        System.out.println("Maior sequencia alfabetica: "
                + maiorSequenciaAlfabetica(texto.toString()));
    }
}
