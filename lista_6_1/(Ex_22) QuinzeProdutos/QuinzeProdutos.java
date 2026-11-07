import java.util.Scanner;

public class QuinzeProdutos {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		double preco, media, maior = 0, soma = 0;
		
		for (int i = 1; i <= 15; i++) {
			System.out.print("Valor do Produto: ");
			preco = leia.nextDouble();
			
			if (preco > maior) {
				maior = preco;
				}
			
			soma += preco;
			}
		
		media = soma/15;
		
		System.out.println("Maior preco lido: R$ " + maior);
		System.out.print("Media dos valores lidos: R$ " + media);
		}
	}
