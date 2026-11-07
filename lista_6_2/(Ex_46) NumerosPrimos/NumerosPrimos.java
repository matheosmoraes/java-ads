import java.util.Scanner;

public class NumerosPrimos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		boolean numeroPrimo = true;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		if (numero <= 1) {
			numeroPrimo = false;
			}
		else {
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					numeroPrimo = false;
					}
			}
		if (numeroPrimo == true) {
			System.out.print("O numero " + numero + " Eh primo!");
			}
		else {
			System.out.print("O numero " + numero + " nao eh primo!");
			}
			}
		
	}
}
// Com números primos, basta que ele seja maior que 1, e que nenhum
//Número entre sua raíz quadrada seja divísivel;
