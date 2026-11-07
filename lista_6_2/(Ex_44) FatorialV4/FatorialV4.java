import java.util.Scanner;

public class FatorialV4 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos, t = 1, fatorial = 0;
		
		System.out.print("Digite um numero para ver seu fatorial: ");
		termos = leia.nextInt();
		
		
			
			for (int i = 1; i <= termos; i++) {
				fatorial = t*i;
				t = fatorial;
				
				System.out.print(fatorial);
				
				if (i < termos) {
					System.out.print(", ");
					}
				}
		}
	}
