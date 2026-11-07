import java.util.Scanner;

public class Tabuada {
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		int n, tabuada;
		
		System.out.print("Diga qual tabuada voce quer 1 a 10: ");
		n = leia.nextInt();
		
		if (n > 10) {
			while (n > 10) {
				System.out.print ("Valor invalido! Tente novamente: ");
				n = leia.nextInt();}
			}
		
		for (int i = 1; i <= 10; i++) {
			tabuada = n*i;
			System.out.println(n + " x " + i + " = " + tabuada);}
	}
}
