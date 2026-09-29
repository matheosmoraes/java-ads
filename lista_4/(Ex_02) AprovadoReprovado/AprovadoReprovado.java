import java.util.Scanner;

public class AprovadoReprovado {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite uma nota: ");
		double nota = leia.nextDouble();
		
		if (nota >= 6.0 && nota <= 10) {
			System.out.println("Nota: " + nota);
			System.out.print("APROVADO!");}
		else {
			if (nota < 0 || nota > 10) {
				System.out.print("ERRO: VALOR INVALIDO!");}
			else {
				System.out.println("Nota: " + nota);
				System.out.print("REPROVADO!");}
			}
		}
	}
