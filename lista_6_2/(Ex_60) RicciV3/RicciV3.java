import java.util.Scanner;

public class RicciV3 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c = 0, termos, numero;
		boolean ehRicci = true;
		
		System.out.print ("Digite o termo a:");
		a = leia.nextInt();
		
		System.out.print ("Digite o termo b:");
		b = leia.nextInt();
		
		System.out.print ("Digite a quantodade de termos:");
		termos = leia.nextInt();
		
		System.out.print ("Escolha um numero para saber se faz parte da sequencia de Ricci:");
		numero = leia.nextInt();
		
		for (int i = 1; i <= termos; i++) {
			ehRicci = true;
			c = a + b;
			a = b;
			b = c;
			
			if (numero == c) {
				ehRicci = true;
				break;
				}
			else {
				ehRicci = false;
				}
			}
		
		if (ehRicci == true) {
			System.out.print("Faz parte da sequencia de Ricci!");
			}
		else {
			System.out.print("Nao faz parte da sequencia de Ricci!");
			}
		}
	}

