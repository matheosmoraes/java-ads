import java.util.Scanner;

public class NumerosPrimosV4 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um numero para a sequencia de numeros primos: ");
		numero = leia.nextInt();
		
		for (int i = numero; i >= 1; i--) {
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
// A ideia é fazer print da sequencia, só que a partir do último termo
