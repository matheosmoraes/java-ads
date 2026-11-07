import java.util.Scanner;

public class FatorialV5 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos;
		long fatorial = 1, atualFatorial; 
		
		System.out.print("Digite um numero limite para a sequencia de fatorial: ");
		termos = leia.nextInt();
		
		for (int i = 1; i <= termos; i++) {
			fatorial = fatorial*i;
			}
		
		atualFatorial = fatorial;
		
		for (int j = termos; j >= 1; j--) {
			System.out.print (atualFatorial);
			
			if (j > 1) {
				atualFatorial = atualFatorial/j;
				System.out.print(", ");
				}
			}
		}
	}
//Utiliza-se o atualFatorial para realizar o processo inverso do fatorial
//E assim, realizar a sequencia numérica a partir do último número dela;
