import java.util.Scanner;

public class NumerosPerfeitos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, soma = 0;
		
		System.out.print ("Digite um numero para saber se eh um numero perfeito: ");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.print("Nao eh um numero perfeito!");
			}
		else {
			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0 && i != numero) {
					soma += i;
					} 
				}
			
			if (soma == numero) {
				System.out.print("O numero " + numero + " eh um numero perfeito!");
				}
			else {
				System.out.print("O numero " + numero + " nao eh um numero perfeito!");
				}
			}
		}
	}
