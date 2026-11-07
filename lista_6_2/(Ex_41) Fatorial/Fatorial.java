import java.util.Scanner;

public class Fatorial {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos;
		long fatorial = 0, t = 1;
		
		System.out.print("Digite um numero para ver seu fatorial: ");
		termos = leia.nextInt();
		
		for (int i = 1; i <= termos; i++) {
			fatorial = t*i;
			t = fatorial;
			}
		
		System.out.print("Fatorial de " + termos + ": " + fatorial);
		}
	}
