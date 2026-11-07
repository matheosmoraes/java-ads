import java.util.Scanner;

public class FatorialV3 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos, t = 1, fatorial = 0;
		
		for (int i = 1; i <= 7; i++) {
			System.out.print("Digite um numero para ver seu fatorial: ");
			termos = leia.nextInt();
			
			for (int j = 1; j <= termos; j++) {
				fatorial = t*j;
				t = fatorial;
				}
			
			System.out.println("Fatorial de " + termos + ": " + fatorial);
			}
		}
	}
