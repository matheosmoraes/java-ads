import java.util.Scanner;

public class NotasDosAlunos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		double valor, soma = 0, divisao = 2, media;
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Digite a nota do aluno: ");
			valor = leia.nextDouble();
			
			if (valor > 10 || valor < 0) {
				while (valor > 10 || valor < 0) {
					System.out.print("Nota invalida! Tente novamente: ");
					valor = leia.nextDouble();}
				}
			
			soma += valor;
			}
		
		media = soma/divisao;
		
		System.out.print ("Media do Aluno: " + media);
		}
	}
