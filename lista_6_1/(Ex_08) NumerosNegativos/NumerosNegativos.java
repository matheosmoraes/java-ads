import java.util.Scanner;

public class NumerosNegativos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int valor, qntdNegativos = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um valor: ");
			valor = leia.nextInt();
			
			if (valor < 0) {
				qntdNegativos++;}
			}
		
		System.out.print("Quantidade de numeros negativos: " + qntdNegativos);
		}
	}
