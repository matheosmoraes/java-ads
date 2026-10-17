import java.util.Scanner;

public class CompraMacas{
	public static void main (String[] args){
		Scanner leia = new Scanner (System.in);
		
		double precoMaca = 0, precoTotal = 0;
		
		int quantidade;
		
		System.out.print("Quantidade de macas: ");
		quantidade = leia.nextInt();
		
		if (quantidade < 12) {
			precoMaca = 1.30;
			precoTotal = quantidade * precoMaca;
			
			System.out.print("Preço Total a ser pago: R$" + precoTotal); 
			}
		else {
			precoMaca = 1.00;
			precoTotal = quantidade * precoMaca;
			
			System.out.print("Preço Total a ser pago: R$" + precoTotal);}
		}
	}
