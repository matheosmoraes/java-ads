import java.util.Scanner;

public class SomaInclusivav2 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor1, valor2, soma = 0;
		
		System.out.print ("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.print ("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		if (valor1 < valor2) {
			for (int i = valor1; i <= valor2; i++) {
				soma += i;
				}
			}
		else {
			for (int i = valor2; i <= valor1; i++) {
				soma += i;
				}
			}
		
		System.out.print("Soma dos valores entre Valor 1 e Valor 2: " + soma);
		}
	}
