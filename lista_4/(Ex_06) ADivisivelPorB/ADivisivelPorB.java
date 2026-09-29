import java.util.Scanner;

public class ADivisivelPorB {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean ok_a, ok_b;
		
		System.out.print("Digite o valor A: ");
		int a = leia.nextInt();
		
		if (a > 1000) {
			ok_a = false;
			System.out.print ("ERRO: NUMERO INVALIDO!");
			System.exit(0);
			}
		else{
			ok_a = true;
			}
		
		System.out.print("Digite o valor B: ");
		int b = leia.nextInt();
		
		if (b > 20) {
			ok_b = false;
			System.out.print ("ERRO: NUMERO INVALIDO!");
			System.exit(0);
			}
		else{
			ok_b = true;
			}
		
		if (b >= 1) {
			System.out.println("Divisor valido.");}
		else {
			System.out.print("Nao eh possivel realizar a divisao.");
			System.exit(0);}
		
		if (a % b == 0) {
			System.out.print("A eh divisivel por B.");
			}
		else {
			System.out.print("A NAO eh divisivel por B.");}
		}
	}
