import java.util.Scanner;

public class VerificaValorProduto {
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		boolean ok_produto1, ok_produto2;
		
		System.out.print("Defina valor do produto 1: ");
		double produto1 = leia.nextDouble();
		
		if (produto1 <= 0 || produto1 >= 1000){
			ok_produto1 = false;
			System.out.print("ERRO: VALOR INVALIDO!");
			System.exit(0);
			}
		else {
			ok_produto1 = true;}
		
		System.out.print("Defina valor do produto 2: ");
		double produto2 = leia.nextDouble();
		
		if (produto2 <= 0 || produto2 >= 1000){
			ok_produto2 = false;
			System.out.print("ERRO: VALOR INVALIDO!");
			System.exit(0);
			}
		else {
			ok_produto2 = true;}
		
		if (produto1 < produto2) {
			System.out.print("Produto 1 eh o mais barato!");
			}
		
		else {
			if (produto1 == produto2) {
				System.out.print("Os dois produtos tem o mesmo valor!");
				}
			else {
				System.out.print("Produto 2 eh o mais barato!");}
			}
		
		}
	}
