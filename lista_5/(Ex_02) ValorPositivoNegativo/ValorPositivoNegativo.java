import java.util.Scanner;

public class ValorPositivoNegativo {
	public static void main (String[] args){
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um Numero: ");
		int numero = leia.nextInt();
		
		if (numero > 0) {
			System.out.print("NUMERO POSITIVO!");}
		else {
			System.out.print("NUMERO NEGATIVO!");}
		}
	}
