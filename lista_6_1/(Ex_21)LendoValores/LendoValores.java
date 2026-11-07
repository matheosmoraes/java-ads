//VAI SE FUDEEEEEEEEE, CRISTOVAAAAAAAAAAAAAAAAAAAAAAAAAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
import java.util.Scanner;

public class LendoValores {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		Scanner leia2 = new Scanner (System.in);
		
		int valor = 0, 
		    maior = 0, 
		    menor = 0,
		    qntd  = 0,
		    soma  = 0,
		    media = 0;
		
		System.out.print("Quantidade numeros a serem lidos: ");
		qntd = leia.nextInt();
		
		for (int i = 1; i <= qntd; i++) {
			System.out.print("Digite um valor: ");
			valor = leia2.nextInt();
			
			if (i == 1) {
				maior = valor;
				menor = valor;
				soma += valor;
				}
			else {
				if (valor > maior) {
					maior = valor;
					soma += valor;}
				else {
					if (valor < menor) {
						menor = valor;
						soma += valor;
						}
					else {
						soma += valor;
						}
						}
					}
			}
		
		media = soma/qntd;
		
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
		System.out.print("Media dos valores: " + media);
		}
	}

