import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos, a, b, c;
		
		System.out.print("Digite um numero de termos para a sequencia de Fibonacci: ");
		termos = leia.nextInt();
		
		a = 0;
		b = 1;
		
		System.out.print(a + ", ");
		
		for (int i = 1; i <= termos; i++) {
			c = a + b;
			System.out.print (c);
			
			a = b;
			b = c;
			
			if (i < termos) {
				System.out.print(", ");
				}
			}
		}
	}
