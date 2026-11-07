import java.util.Scanner;

public class NumerosPrimosV5 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, termoInicial;
		
		System.out.print("Digite o termo inicial para a sequencia de numeros primos: ");
		termoInicial = leia.nextInt();
		
		System.out.print("Digite um numero para a sequencia de numeros primos: ");
		numero = leia.nextInt();
		
		for (int i = termoInicial; i <= numero; i++) {
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
