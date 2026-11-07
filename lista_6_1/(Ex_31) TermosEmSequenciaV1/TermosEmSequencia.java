import java.util.Scanner;

public class TermosEmSequencia {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos;
		
		System.out.print("Digite um total de termos para sequencia: ");
		termos = leia.nextInt();
		
		if (termos < 0) {
			System.out.print("Valor invalido! Tente novamente: ");
			termos = leia.nextInt();
				}
		else {
			if (termos == 0) {
				System.out.print("Encerrando o programa...");
				System.exit(0);
				}
			else {
				for (int i = 1; i <= termos; i++) {
					System.out.print(i + ",");
					}
				}
			}
		}
	}
