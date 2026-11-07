import java.util.Scanner;

public class Ricci {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.print ("Digite o termo a:");
		a = leia.nextInt();
		
		System.out.print ("Digite o termo b:");
		b = leia.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(c);
			
			a = b;
			b = c;
			
			if (i < 10) {
				System.out.print(", ");
				}
			}
		}
	}
