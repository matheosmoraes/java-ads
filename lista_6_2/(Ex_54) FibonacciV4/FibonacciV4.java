import java.util.Scanner;

public class FibonacciV4 {
	public static void main(String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termoInicial, termoFinal, a, b, c;
		
		System.out.print("Digite o termo inicial para a sequencia de Fibonacci: ");
		termoInicial = leia.nextInt();
		
		System.out.print("Digite o termo final para a sequencia de Fibonacci: ");
		termoFinal = leia.nextInt();
		
		a = 0;
		b = 1;
		
		for (int i = 1; i <= termoFinal; i++) {
			c = a + b;
			a = b;
			b = c;
			
			if (i >= termoInicial) {
				System.out.print(c);
				
				if (i < termoFinal) {
					System.out.print(", ");
				}
			}
		}
	}
}
