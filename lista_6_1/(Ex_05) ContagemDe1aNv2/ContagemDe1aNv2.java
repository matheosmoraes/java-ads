import java.util.Scanner;

public class ContagemDe1aNv2 {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int n;
		
		System.out.print("Diga qual eh o numero final da contagem: ");
		n = leia.nextInt();
		
		if (n < 0) {
			while (n < 0) {
				System.out.print ("Valor invalido! Tente novamente: ");
				n = leia.nextInt();}
			}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);}
		}
	}
