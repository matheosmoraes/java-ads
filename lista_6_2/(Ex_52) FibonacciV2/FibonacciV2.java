import java.util.Scanner;

public class FibonacciV2 {
	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, a, b, c = 0;
		boolean ehFibonacci = true;
		
		System.out.print("Digite um numero de termos para saber se esta na sequencia de Fibonacci: ");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.print ("O numero " + numero + "Nao pertence a sequencia de Fibonacci!");
			}
		else {
			a = 0;
			b = 1;
			
			while (a < numero) {
				c = a + b;
				a = b;
				b = c;
				}
			
			if (a == numero) {
				System.out.print("Eh da sequencia de Fibonacci!");
				}
			else {
				System.out.print("Nao eh da sequencia de Fibonacci!");
				}
			}
			}
		}


