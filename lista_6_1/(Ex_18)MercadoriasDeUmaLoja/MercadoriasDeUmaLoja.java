import java.util.Scanner;

public class MercadoriasDeUmaLoja {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int qntdMercadorias;
		double valorMercadoria, media, soma = 0;
		
		System.out.print("Quantas mercadorias a loja possui?: ");
		qntdMercadorias = leia.nextInt();
		
		for (int i = 1; i <= qntdMercadorias; i++) {
		System.out.print("Valor da Mercadoria: R$ ");
		valorMercadoria = leia.nextDouble();
		
		soma += valorMercadoria;
		}
		
		media = soma/qntdMercadorias;
		
		System.out.print("Media de valor das mercadorias: " + media);
	}
}
