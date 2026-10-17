import java.util.Scanner;

public class DoisValoresEmOrdemCrescente {
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.print("Entre com o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		numero2 = leia.nextInt();
		
		if (numero1 > numero2) {
			System.out.print(numero1 + ", " + numero2);}
		else {
			System.out.print(numero2 + ", " + numero1);}
		}
	}
