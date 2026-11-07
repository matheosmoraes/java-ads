import java.util.Scanner;

public class NumerosEntre10e20 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor, qntdNumeros = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			
			if (valor >= 10 && valor <= 20 ) {
				qntdNumeros++;}
			}
		
		System.out.print("Quantidade de numeros entre 10 e 20: " + qntdNumeros);
		}
	}
