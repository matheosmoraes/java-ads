import java.util.Scanner;

public class NumerosPrimosV3{
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um numero para a sequencia de numeros primos: ");
		numero = leia.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			boolean numeroPrimo = true;
			
			if (i <= 1) {
				numeroPrimo = false;
				}
			else {
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						numeroPrimo = false;
						}
				}
			}
			if (numeroPrimo == true) {
				System.out.println(i);
				}
		}
	}
}
