import java.util.Scanner;

public class RicciV2 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, termos;
		
		System.out.print ("Digite o termo a:");
		a = leia.nextInt();
		
		System.out.print ("Digite o termo b:");
		b = leia.nextInt();
		
		System.out.print ("Digite a quantodade de termos:");
		termos = leia.nextInt();
		
		for (int i = 1; i <= termos; i++) {
			c = a + b;
			System.out.print(c);
			
			a = b;
			b = c;
			
			if (i < termos) {
				System.out.print(", ");
				}
			}
		}
	}
