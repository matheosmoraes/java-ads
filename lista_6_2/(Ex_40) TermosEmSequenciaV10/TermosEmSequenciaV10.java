import java.util.Scanner;

public class TermosEmSequenciaV10 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int termos, metade;
		
		System.out.print("Digite um total de termos para sequencia: ");
		termos = leia.nextInt();
		metade = termos/2;
		
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
					int valorAtual;
					if (i <= metade) {
						valorAtual = i;
						System.out.print(valorAtual);
						}
					else {
						valorAtual = termos - i + 1;
						System.out.print(valorAtual);
						}
					
					if (i < termos) {
						System.out.print(", ");
						}
					}
				}
			}
		}
	}
