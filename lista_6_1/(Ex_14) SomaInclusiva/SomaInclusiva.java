import java.util.Scanner;

public class SomaInclusiva {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor1, valor2, soma = 0;
		
		System.out.print ("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.print ("Digite o segundo valor, maior que o primeiro: ");
		valor2 = leia.nextInt();
		
		for (int i = valor1; i <= valor2; i++) {
			soma += i;
			}
		
		System.out.print("Soma dos valores entre Valor 1 e Valor 2: " + soma);
		}
	}
