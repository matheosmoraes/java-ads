//VAI SE FUDEEEEEEEEE, CRISTOVAAAAAAAAAAAAAAAAAAAAAAAAAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
import java.util.Scanner;

public class LendoCemValores {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor = 0, 
		    maior = 0, 
		    menor = 0;
		
		for (int i = 1; i <= 100; i++) {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			
			if (i == 1) {
				maior = valor;
				menor = valor;
				}
			else {
				if (valor > maior) {
					maior = valor;}
				else {
					if (valor < menor) {
						menor = valor;
						}
						}
					}
			}
		
		System.out.println("Maior numero: " + maior);
		System.out.print("Menor numero: " + menor);
		}
	}
