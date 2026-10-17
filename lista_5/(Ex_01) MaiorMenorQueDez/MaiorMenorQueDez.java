import java.util.Scanner;

public class MaiorMenorQueDez {
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int numero = leia.nextInt();
		
		if (numero > 10) {
			System.out.print("NUMERO EH MAIOR QUE DEZ!");}
		else {
			System.out.print("NUMERO EH MENOR QUE DEZ!");}
		}
	}
