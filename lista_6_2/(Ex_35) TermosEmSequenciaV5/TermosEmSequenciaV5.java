import java.util.Scanner;

public class TermosEmSequenciaV5 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos, t = 0;
		
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
					if ( i % 2 == 0) {
						t *= -1;
						System.out.print(t + ", ");
						}
					else {
						t *= -1;
						t++;
						System.out.print(t + ", ");
						}
				}
			}
		}
	}
}
